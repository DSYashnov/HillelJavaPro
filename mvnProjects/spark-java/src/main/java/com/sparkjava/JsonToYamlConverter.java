package com.sparkjava;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

public class JsonToYamlConverter {
    public static void main(String[] args) {
        String jsonInput = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";

        try{
            //create ObjectMapper for JSON
            ObjectMapper jsonMapper = new ObjectMapper();
            //parse JSON string to JsonNode
            JsonNode jsonNode = jsonMapper.readTree(jsonInput);

            //create YAMLMapper for YAML
            YAMLMapper yamlMapper = new YAMLMapper();
            //convert JsonNode tp YAML string
            String yamlOutput = yamlMapper.writeValueAsString(jsonNode);

            System.out.println("Yaml output");
            System.out.println(yamlOutput);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
