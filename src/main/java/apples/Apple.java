package apples;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Apple {
    private int weight = 0;
    private Color color;


}
