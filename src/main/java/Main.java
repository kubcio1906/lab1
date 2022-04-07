import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        User userObject = new User("John", 21);
        String userJson = objectMapper.writeValueAsString(userObject);

        System.out.println(userJson);

        ObjectMapper objectMapper2 = new ObjectMapper();

        String userJson2 = "{\"name\":\"John\",\"age\":21}";              // {"name":"John","age":21}
        User2 userObject2 = objectMapper2.readValue(userJson2, User2.class);

        System.out.println(userObject2.getName());                        // John
        System.out.println(userObject2.getAge());
    }

}
