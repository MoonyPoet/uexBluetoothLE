package org.zywx.wbpalmstar.plugin.uexbluetoothle.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yanlongtao on 2015/4/14.
 */
public class CharacteristicVO implements Serializable {

    private static final long serialVersionUID = -5993349996621831752L;
    private String valueString;
    private String uuid;

    private int permissions;

    private int writeType;

    private List<GattDescriptorVO> gattDescriptors;

    public String getValueString() {
        return valueString;
    }

    public void setValueString(String valueString) {
        this.valueString = valueString;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public List<GattDescriptorVO> getGattDescriptors() {
        return gattDescriptors;
    }

    public void setGattDescriptors(List<GattDescriptorVO> gattDescriptors) {
        this.gattDescriptors = gattDescriptors;
    }

    public int getPermissions() {
        return permissions;
    }

    public void setPermissions(int permissions) {
        this.permissions = permissions;
    }

    public int getWriteType() {
        return writeType;
    }

    public void setWriteType(int writeType) {
        this.writeType = writeType;
    }
}