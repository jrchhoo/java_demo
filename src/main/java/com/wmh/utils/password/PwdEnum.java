package com.wmh.utils.password;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @program: bill-admin-server
 * @description: 密码键盘对应
 * @author: Mr.Hou
 * @create: 2021-01-28 23:47
 **/
@Getter
@AllArgsConstructor
public enum PwdEnum {
    QAZ("1", "!", List.of("q", "a", "z")),
    WSX("2", "@", List.of("w", "s", "x")),
    EDC("3", "#", List.of("e", "d", "c")),
    RFV("4", "$", List.of("r", "f", "v")),
    TGB("5", "%", List.of("t", "g", "b")),
    YHN("6", "^", List.of("y", "h", "n")),
    UJM("7", "&", List.of("u", "j", "m")),
    IK("8", "*", List.of("i", "k")),
    OL("9", "(", List.of("o", "l")),
    P("0", ")", List.of("p"));


    private String code;
    private String mark;
    private List<String> alphabet;

    public static PwdEnum getEnumFromAlphabet(String alphabet) {

        for (PwdEnum pwdEnum: PwdEnum.values()) {
            if (pwdEnum.getAlphabet().contains(alphabet)) {
                return pwdEnum;
            }
        }
        return null;
    }
}
