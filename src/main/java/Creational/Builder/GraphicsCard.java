package Creational.Builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GraphicsCard {
    private int memoryInMB;
    private String producer;
    private String series;
    private String modelName;

}
