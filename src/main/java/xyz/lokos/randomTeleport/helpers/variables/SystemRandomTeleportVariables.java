package xyz.lokos.randomTeleport.helpers.variables;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.Sound;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class SystemRandomTeleportVariables {

    private Integer RandomTeleportX;
    private Integer RandomTeleportXx;
    private Integer RandomTeleportZ;
    private Integer RandomTeleportZz;
    private Material RandomTeleportMaterialClick;
    private String RandomTeleportMessage;
    private Sound RandomTeleportSound;
}
