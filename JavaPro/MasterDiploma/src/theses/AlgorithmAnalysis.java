package theses;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class AlgorithmAnalysis {
    private static final SystemInfo systemInfo = new SystemInfo();
    private static final CentralProcessor processor = systemInfo.getHardware().getProcessor();
    private static final GlobalMemory memory = systemInfo.getHardware().getMemory();

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static double getCpuLoad() {
        return processor.getSystemCpuLoadBetweenTicks() * 100;
    }

    private static double getMemoryUsage() {
        long usedMemory = memory.getTotal() - memory.getAvailable();
        return (double) usedMemory / (1024 * 1024); // Пам'ять у MB
    }

    public static void analyzeAlgorithm(Runnable algorithm, int iterations) {
        List<Double> cpuUsageList = new ArrayList<>();
        List<Double> memoryUsageList = new ArrayList<>();
        List<Long> timeList = new ArrayList<>();

        long startTime = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            cpuUsageList.add(getCpuLoad());
            memoryUsageList.add(getMemoryUsage());
            timeList.add(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTime));

            algorithm.run();
        }

        plotResults(timeList, cpuUsageList, memoryUsageList);
    }

    private static void plotResults(List<Long> times, List<Double> cpuUsage, List<Double> memoryUsage) {
        XYSeries cpuSeries = new XYSeries("CPU Usage (%)");
        XYSeries memorySeries = new XYSeries("Memory Usage (MB)");

        for (int i = 0; i < times.size(); i++) {
            cpuSeries.add(times.get(i), cpuUsage.get(i));
            memorySeries.add(times.get(i), memoryUsage.get(i));
        }

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(cpuSeries);
        dataset.addSeries(memorySeries);

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Algorithm Resource Usage", "Time (ms)", "Usage", dataset,
                PlotOrientation.VERTICAL, true, true, false);

        XYPlot plot = chart.getXYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        plot.setRenderer(renderer);

        JFrame frame = new JFrame("Performance Analysis");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ChartPanel(chart), BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        int[] data = new int[1000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 1000);
        }

        analyzeAlgorithm(() -> bubbleSort(data.clone()), 10);
    }
}
}
