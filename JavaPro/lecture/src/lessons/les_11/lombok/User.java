package lessons.les_11.lombok;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private String name;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private String email;
    private String phone;


    public void printUser (User user) {
        System.out.println(user);
    }
}
