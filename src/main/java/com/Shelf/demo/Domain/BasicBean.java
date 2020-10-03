package com.Shelf.demo.Domain;


import org.apache.ibatis.type.Alias;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Vector;

/**
 *
 * 实体基类，用于存放96点值。
 */
@Alias("basicData")
public class BasicBean<T>{

    private static final long serialVersionUID = 1L;
    //private static final long serialVersionUID = 2319310339632561019L;

    private String mdate;

    private List<String> dates;

    private Vector<Double> vector96 = null;

    private Integer curPoint;

    private List<Map<String, Object>> mapList;

    private Map<String, Object> allData;

    private Double h01;
    private Double h02;
    private Double h03;
    private Double h04;
    private Double h05;
    private Double h06;
    private Double h07;
    private Double h08;
    private Double h09;
    private Double h10;

    private Double h11;
    private Double h12;
    private Double h13;
    private Double h14;
    private Double h15;
    private Double h16;
    private Double h17;
    private Double h18;
    private Double h19;
    private Double h20;

    private Double h21;
    private Double h22;
    private Double h23;
    private Double h24;
    private Double h25;
    private Double h26;
    private Double h27;
    private Double h28;
    private Double h29;
    private Double h30;

    private Double h31;
    private Double h32;
    private Double h33;
    private Double h34;
    private Double h35;
    private Double h36;
    private Double h37;
    private Double h38;
    private Double h39;
    private Double h40;

    private Double h41;
    private Double h42;
    private Double h43;
    private Double h44;
    private Double h45;
    private Double h46;
    private Double h47;
    private Double h48;
    private Double h49;
    private Double h50;

    private Double h51;
    private Double h52;
    private Double h53;
    private Double h54;
    private Double h55;
    private Double h56;
    private Double h57;
    private Double h58;
    private Double h59;
    private Double h60;

    private Double h61;
    private Double h62;
    private Double h63;
    private Double h64;
    private Double h65;
    private Double h66;
    private Double h67;
    private Double h68;
    private Double h69;
    private Double h70;

    private Double h71;
    private Double h72;
    private Double h73;
    private Double h74;
    private Double h75;
    private Double h76;
    private Double h77;
    private Double h78;
    private Double h79;
    private Double h80;

    private Double h81;
    private Double h82;
    private Double h83;
    private Double h84;
    private Double h85;
    private Double h86;
    private Double h87;
    private Double h88;
    private Double h89;
    private Double h90;

    private Double h91;
    private Double h92;
    private Double h93;
    private Double h94;
    private Double h95;
    private Double h96;


    private Double f00;
    private Double f01;
    private Double f02;
    private Double f03;
    private Double f04;
    private Double f05;
    private Double f06;
    private Double f07;
    private Double f08;
    private Double f09;
    private Double f10;

    private Double f11;
    private Double f12;
    private Double f13;
    private Double f14;
    private Double f15;
    private Double f16;
    private Double f17;
    private Double f18;
    private Double f19;
    private Double f20;

    private Double f21;
    private Double f22;
    private Double f23;
    private Double f24;
    private Double f25;
    private Double f26;
    private Double f27;
    private Double f28;
    private Double f29;
    private Double f30;

    private Double f31;
    private Double f32;
    private Double f33;
    private Double f34;
    private Double f35;
    private Double f36;
    private Double f37;
    private Double f38;
    private Double f39;
    private Double f40;

    private Double f41;
    private Double f42;
    private Double f43;
    private Double f44;
    private Double f45;
    private Double f46;
    private Double f47;
    private Double f48;
    private Double f49;
    private Double f50;

    private Double f51;
    private Double f52;
    private Double f53;
    private Double f54;
    private Double f55;
    private Double f56;
    private Double f57;
    private Double f58;
    private Double f59;
    private Double f60;

    private Double f61;
    private Double f62;
    private Double f63;
    private Double f64;
    private Double f65;
    private Double f66;
    private Double f67;
    private Double f68;
    private Double f69;
    private Double f70;

    private Double f71;
    private Double f72;
    private Double f73;
    private Double f74;
    private Double f75;
    private Double f76;
    private Double f77;
    private Double f78;
    private Double f79;
    private Double f80;

    private Double f81;
    private Double f82;
    private Double f83;
    private Double f84;
    private Double f85;
    private Double f86;
    private Double f87;
    private Double f88;
    private Double f89;
    private Double f90;

    private Double f91;
    private Double f92;
    private Double f93;
    private Double f94;
    private Double f95;


    private Double l01;
    private Double l02;
    private Double l03;
    private Double l04;
    private Double l05;
    private Double l06;
    private Double l07;
    private Double l08;
    private Double l09;
    private Double l10;

    private Double l11;
    private Double l12;
    private Double l13;
    private Double l14;
    private Double l15;
    private Double l16;
    private Double l17;
    private Double l18;
    private Double l19;
    private Double l20;

    private Double l21;
    private Double l22;
    private Double l23;
    private Double l24;
    private Double l25;
    private Double l26;
    private Double l27;
    private Double l28;
    private Double l29;
    private Double l30;

    private Double l31;
    private Double l32;
    private Double l33;
    private Double l34;
    private Double l35;
    private Double l36;
    private Double l37;
    private Double l38;
    private Double l39;
    private Double l40;

    private Double l41;
    private Double l42;
    private Double l43;
    private Double l44;
    private Double l45;
    private Double l46;
    private Double l47;
    private Double l48;
    private Double l49;
    private Double l50;

    private Double l51;
    private Double l52;
    private Double l53;
    private Double l54;
    private Double l55;
    private Double l56;
    private Double l57;
    private Double l58;
    private Double l59;
    private Double l60;

    private Double l61;
    private Double l62;
    private Double l63;
    private Double l64;
    private Double l65;
    private Double l66;
    private Double l67;
    private Double l68;
    private Double l69;
    private Double l70;

    private Double l71;
    private Double l72;
    private Double l73;
    private Double l74;
    private Double l75;
    private Double l76;
    private Double l77;
    private Double l78;
    private Double l79;
    private Double l80;

    private Double l81;
    private Double l82;
    private Double l83;
    private Double l84;
    private Double l85;
    private Double l86;
    private Double l87;
    private Double l88;
    private Double l89;
    private Double l90;

    private Double l91;
    private Double l92;
    private Double l93;
    private Double l94;
    private Double l95;
    private Double l96;



    public List<Map<String, Object>> getMapList() {
        return mapList;
    }

    public void setMapList(List<Map<String, Object>> mapList) {
        this.mapList = mapList;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }


    public Map<String, Object> getAllData() {
        return allData;
    }

    public void setAllData(Map<String, Object> allData) {
        this.allData = allData;
    }

    public Double getH01() {
        return h01;
    }

    public void setH01(Double h01) {
        this.h01 = h01;
    }

    public Double getH02() {
        return h02;
    }

    public void setH02(Double h02) {
        this.h02 = h02;
    }

    public Double getH03() {
        return h03;
    }

    public void setH03(Double h03) {
        this.h03 = h03;
    }

    public Double getH04() {
        return h04;
    }

    public void setH04(Double h04) {
        this.h04 = h04;
    }

    public Double getH05() {
        return h05;
    }

    public void setH05(Double h05) {
        this.h05 = h05;
    }

    public Double getH06() {
        return h06;
    }

    public void setH06(Double h06) {
        this.h06 = h06;
    }

    public Double getH07() {
        return h07;
    }

    public void setH07(Double h07) {
        this.h07 = h07;
    }

    public Double getH08() {
        return h08;
    }

    public void setH08(Double h08) {
        this.h08 = h08;
    }

    public Double getH09() {
        return h09;
    }

    public void setH09(Double h09) {
        this.h09 = h09;
    }

    public Double getH10() {
        return h10;
    }

    public void setH10(Double h10) {
        this.h10 = h10;
    }

    public Double getH11() {
        return h11;
    }

    public void setH11(Double h11) {
        this.h11 = h11;
    }

    public Double getH12() {
        return h12;
    }

    public void setH12(Double h12) {
        this.h12 = h12;
    }

    public Double getH13() {
        return h13;
    }

    public void setH13(Double h13) {
        this.h13 = h13;
    }

    public Double getH14() {
        return h14;
    }

    public void setH14(Double h14) {
        this.h14 = h14;
    }

    public Double getH15() {
        return h15;
    }

    public void setH15(Double h15) {
        this.h15 = h15;
    }

    public Double getH16() {
        return h16;
    }

    public void setH16(Double h16) {
        this.h16 = h16;
    }

    public Double getH17() {
        return h17;
    }

    public void setH17(Double h17) {
        this.h17 = h17;
    }

    public Double getH18() {
        return h18;
    }

    public void setH18(Double h18) {
        this.h18 = h18;
    }

    public Double getH19() {
        return h19;
    }

    public void setH19(Double h19) {
        this.h19 = h19;
    }

    public Double getH20() {
        return h20;
    }

    public void setH20(Double h20) {
        this.h20 = h20;
    }

    public Double getH21() {
        return h21;
    }

    public void setH21(Double h21) {
        this.h21 = h21;
    }

    public Double getH22() {
        return h22;
    }

    public void setH22(Double h22) {
        this.h22 = h22;
    }

    public Double getH23() {
        return h23;
    }

    public void setH23(Double h23) {
        this.h23 = h23;
    }

    public Double getH24() {
        return h24;
    }

    public void setH24(Double h24) {
        this.h24 = h24;
    }

    public Double getH25() {
        return h25;
    }

    public void setH25(Double h25) {
        this.h25 = h25;
    }

    public Double getH26() {
        return h26;
    }

    public void setH26(Double h26) {
        this.h26 = h26;
    }

    public Double getH27() {
        return h27;
    }

    public void setH27(Double h27) {
        this.h27 = h27;
    }

    public Double getH28() {
        return h28;
    }

    public void setH28(Double h28) {
        this.h28 = h28;
    }

    public Double getH29() {
        return h29;
    }

    public void setH29(Double h29) {
        this.h29 = h29;
    }

    public Double getH30() {
        return h30;
    }

    public void setH30(Double h30) {
        this.h30 = h30;
    }

    public Double getH31() {
        return h31;
    }

    public void setH31(Double h31) {
        this.h31 = h31;
    }

    public Double getH32() {
        return h32;
    }

    public void setH32(Double h32) {
        this.h32 = h32;
    }

    public Double getH33() {
        return h33;
    }

    public void setH33(Double h33) {
        this.h33 = h33;
    }

    public Double getH34() {
        return h34;
    }

    public void setH34(Double h34) {
        this.h34 = h34;
    }

    public Double getH35() {
        return h35;
    }

    public void setH35(Double h35) {
        this.h35 = h35;
    }

    public Double getH36() {
        return h36;
    }

    public void setH36(Double h36) {
        this.h36 = h36;
    }

    public Double getH37() {
        return h37;
    }

    public void setH37(Double h37) {
        this.h37 = h37;
    }

    public Double getH38() {
        return h38;
    }

    public void setH38(Double h38) {
        this.h38 = h38;
    }

    public Double getH39() {
        return h39;
    }

    public void setH39(Double h39) {
        this.h39 = h39;
    }

    public Double getH40() {
        return h40;
    }

    public void setH40(Double h40) {
        this.h40 = h40;
    }

    public Double getH41() {
        return h41;
    }

    public void setH41(Double h41) {
        this.h41 = h41;
    }

    public Double getH42() {
        return h42;
    }

    public void setH42(Double h42) {
        this.h42 = h42;
    }

    public Double getH43() {
        return h43;
    }

    public void setH43(Double h43) {
        this.h43 = h43;
    }

    public Double getH44() {
        return h44;
    }

    public void setH44(Double h44) {
        this.h44 = h44;
    }

    public Double getH45() {
        return h45;
    }

    public void setH45(Double h45) {
        this.h45 = h45;
    }

    public Double getH46() {
        return h46;
    }

    public void setH46(Double h46) {
        this.h46 = h46;
    }

    public Double getH47() {
        return h47;
    }

    public void setH47(Double h47) {
        this.h47 = h47;
    }

    public Double getH48() {
        return h48;
    }

    public void setH48(Double h48) {
        this.h48 = h48;
    }

    public Double getH49() {
        return h49;
    }

    public void setH49(Double h49) {
        this.h49 = h49;
    }

    public Double getH50() {
        return h50;
    }

    public void setH50(Double h50) {
        this.h50 = h50;
    }

    public Double getH51() {
        return h51;
    }

    public void setH51(Double h51) {
        this.h51 = h51;
    }

    public Double getH52() {
        return h52;
    }

    public void setH52(Double h52) {
        this.h52 = h52;
    }

    public Double getH53() {
        return h53;
    }

    public void setH53(Double h53) {
        this.h53 = h53;
    }

    public Double getH54() {
        return h54;
    }

    public void setH54(Double h54) {
        this.h54 = h54;
    }

    public Double getH55() {
        return h55;
    }

    public void setH55(Double h55) {
        this.h55 = h55;
    }

    public Double getH56() {
        return h56;
    }

    public void setH56(Double h56) {
        this.h56 = h56;
    }

    public Double getH57() {
        return h57;
    }

    public void setH57(Double h57) {
        this.h57 = h57;
    }

    public Double getH58() {
        return h58;
    }

    public void setH58(Double h58) {
        this.h58 = h58;
    }

    public Double getH59() {
        return h59;
    }

    public void setH59(Double h59) {
        this.h59 = h59;
    }

    public Double getH60() {
        return h60;
    }

    public void setH60(Double h60) {
        this.h60 = h60;
    }

    public Double getH61() {
        return h61;
    }

    public void setH61(Double h61) {
        this.h61 = h61;
    }

    public Double getH62() {
        return h62;
    }

    public void setH62(Double h62) {
        this.h62 = h62;
    }

    public Double getH63() {
        return h63;
    }

    public void setH63(Double h63) {
        this.h63 = h63;
    }

    public Double getH64() {
        return h64;
    }

    public void setH64(Double h64) {
        this.h64 = h64;
    }

    public Double getH65() {
        return h65;
    }

    public void setH65(Double h65) {
        this.h65 = h65;
    }

    public Double getH66() {
        return h66;
    }

    public void setH66(Double h66) {
        this.h66 = h66;
    }

    public Double getH67() {
        return h67;
    }

    public void setH67(Double h67) {
        this.h67 = h67;
    }

    public Double getH68() {
        return h68;
    }

    public void setH68(Double h68) {
        this.h68 = h68;
    }

    public Double getH69() {
        return h69;
    }

    public void setH69(Double h69) {
        this.h69 = h69;
    }

    public Double getH70() {
        return h70;
    }

    public void setH70(Double h70) {
        this.h70 = h70;
    }

    public Double getH71() {
        return h71;
    }

    public void setH71(Double h71) {
        this.h71 = h71;
    }

    public Double getH72() {
        return h72;
    }

    public void setH72(Double h72) {
        this.h72 = h72;
    }

    public Double getH73() {
        return h73;
    }

    public void setH73(Double h73) {
        this.h73 = h73;
    }

    public Double getH74() {
        return h74;
    }

    public void setH74(Double h74) {
        this.h74 = h74;
    }

    public Double getH75() {
        return h75;
    }

    public void setH75(Double h75) {
        this.h75 = h75;
    }

    public Double getH76() {
        return h76;
    }

    public void setH76(Double h76) {
        this.h76 = h76;
    }

    public Double getH77() {
        return h77;
    }

    public void setH77(Double h77) {
        this.h77 = h77;
    }

    public Double getH78() {
        return h78;
    }

    public void setH78(Double h78) {
        this.h78 = h78;
    }

    public Double getH79() {
        return h79;
    }

    public void setH79(Double h79) {
        this.h79 = h79;
    }

    public Double getH80() {
        return h80;
    }

    public void setH80(Double h80) {
        this.h80 = h80;
    }

    public Double getH81() {
        return h81;
    }

    public void setH81(Double h81) {
        this.h81 = h81;
    }

    public Double getH82() {
        return h82;
    }

    public void setH82(Double h82) {
        this.h82 = h82;
    }

    public Double getH83() {
        return h83;
    }

    public void setH83(Double h83) {
        this.h83 = h83;
    }

    public Double getH84() {
        return h84;
    }

    public void setH84(Double h84) {
        this.h84 = h84;
    }

    public Double getH85() {
        return h85;
    }

    public void setH85(Double h85) {
        this.h85 = h85;
    }

    public Double getH86() {
        return h86;
    }

    public void setH86(Double h86) {
        this.h86 = h86;
    }

    public Double getH87() {
        return h87;
    }

    public void setH87(Double h87) {
        this.h87 = h87;
    }

    public Double getH88() {
        return h88;
    }

    public void setH88(Double h88) {
        this.h88 = h88;
    }

    public Double getH89() {
        return h89;
    }

    public void setH89(Double h89) {
        this.h89 = h89;
    }

    public Double getH90() {
        return h90;
    }

    public void setH90(Double h90) {
        this.h90 = h90;
    }

    public Double getH91() {
        return h91;
    }

    public void setH91(Double h91) {
        this.h91 = h91;
    }

    public Double getH92() {
        return h92;
    }

    public void setH92(Double h92) {
        this.h92 = h92;
    }

    public Double getH93() {
        return h93;
    }

    public void setH93(Double h93) {
        this.h93 = h93;
    }

    public Double getH94() {
        return h94;
    }

    public void setH94(Double h94) {
        this.h94 = h94;
    }

    public Double getH95() {
        return h95;
    }

    public void setH95(Double h95) {
        this.h95 = h95;
    }

    public Double getH96() {
        return h96;
    }

    public void setH96(Double h96) {
        this.h96 = h96;
    }

    public Double getF00() {
        return f00;
    }

    public void setF00(Double f00) {
        this.f00 = f00;
    }

    public Double getF01() {
        return f01;
    }

    public void setF01(Double f01) {
        this.f01 = f01;
    }

    public Double getF02() {
        return f02;
    }

    public void setF02(Double f02) {
        this.f02 = f02;
    }

    public Double getF03() {
        return f03;
    }

    public void setF03(Double f03) {
        this.f03 = f03;
    }

    public Double getF04() {
        return f04;
    }

    public void setF04(Double f04) {
        this.f04 = f04;
    }

    public Double getF05() {
        return f05;
    }

    public void setF05(Double f05) {
        this.f05 = f05;
    }

    public Double getF06() {
        return f06;
    }

    public void setF06(Double f06) {
        this.f06 = f06;
    }

    public Double getF07() {
        return f07;
    }

    public void setF07(Double f07) {
        this.f07 = f07;
    }

    public Double getF08() {
        return f08;
    }

    public void setF08(Double f08) {
        this.f08 = f08;
    }

    public Double getF09() {
        return f09;
    }

    public void setF09(Double f09) {
        this.f09 = f09;
    }

    public Double getF10() {
        return f10;
    }

    public void setF10(Double f10) {
        this.f10 = f10;
    }

    public Double getF11() {
        return f11;
    }

    public void setF11(Double f11) {
        this.f11 = f11;
    }

    public Double getF12() {
        return f12;
    }

    public void setF12(Double f12) {
        this.f12 = f12;
    }

    public Double getF13() {
        return f13;
    }

    public void setF13(Double f13) {
        this.f13 = f13;
    }

    public Double getF14() {
        return f14;
    }

    public void setF14(Double f14) {
        this.f14 = f14;
    }

    public Double getF15() {
        return f15;
    }

    public void setF15(Double f15) {
        this.f15 = f15;
    }

    public Double getF16() {
        return f16;
    }

    public void setF16(Double f16) {
        this.f16 = f16;
    }

    public Double getF17() {
        return f17;
    }

    public void setF17(Double f17) {
        this.f17 = f17;
    }

    public Double getF18() {
        return f18;
    }

    public void setF18(Double f18) {
        this.f18 = f18;
    }

    public Double getF19() {
        return f19;
    }

    public void setF19(Double f19) {
        this.f19 = f19;
    }

    public Double getF20() {
        return f20;
    }

    public void setF20(Double f20) {
        this.f20 = f20;
    }

    public Double getF21() {
        return f21;
    }

    public void setF21(Double f21) {
        this.f21 = f21;
    }

    public Double getF22() {
        return f22;
    }

    public void setF22(Double f22) {
        this.f22 = f22;
    }

    public Double getF23() {
        return f23;
    }

    public void setF23(Double f23) {
        this.f23 = f23;
    }

    public Double getF24() {
        return f24;
    }

    public void setF24(Double f24) {
        this.f24 = f24;
    }

    public Double getF25() {
        return f25;
    }

    public void setF25(Double f25) {
        this.f25 = f25;
    }

    public Double getF26() {
        return f26;
    }

    public void setF26(Double f26) {
        this.f26 = f26;
    }

    public Double getF27() {
        return f27;
    }

    public void setF27(Double f27) {
        this.f27 = f27;
    }

    public Double getF28() {
        return f28;
    }

    public void setF28(Double f28) {
        this.f28 = f28;
    }

    public Double getF29() {
        return f29;
    }

    public void setF29(Double f29) {
        this.f29 = f29;
    }

    public Double getF30() {
        return f30;
    }

    public void setF30(Double f30) {
        this.f30 = f30;
    }

    public Double getF31() {
        return f31;
    }

    public void setF31(Double f31) {
        this.f31 = f31;
    }

    public Double getF32() {
        return f32;
    }

    public void setF32(Double f32) {
        this.f32 = f32;
    }

    public Double getF33() {
        return f33;
    }

    public void setF33(Double f33) {
        this.f33 = f33;
    }

    public Double getF34() {
        return f34;
    }

    public void setF34(Double f34) {
        this.f34 = f34;
    }

    public Double getF35() {
        return f35;
    }

    public void setF35(Double f35) {
        this.f35 = f35;
    }

    public Double getF36() {
        return f36;
    }

    public void setF36(Double f36) {
        this.f36 = f36;
    }

    public Double getF37() {
        return f37;
    }

    public void setF37(Double f37) {
        this.f37 = f37;
    }

    public Double getF38() {
        return f38;
    }

    public void setF38(Double f38) {
        this.f38 = f38;
    }

    public Double getF39() {
        return f39;
    }

    public void setF39(Double f39) {
        this.f39 = f39;
    }

    public Double getF40() {
        return f40;
    }

    public void setF40(Double f40) {
        this.f40 = f40;
    }

    public Double getF41() {
        return f41;
    }

    public void setF41(Double f41) {
        this.f41 = f41;
    }

    public Double getF42() {
        return f42;
    }

    public void setF42(Double f42) {
        this.f42 = f42;
    }

    public Double getF43() {
        return f43;
    }

    public void setF43(Double f43) {
        this.f43 = f43;
    }

    public Double getF44() {
        return f44;
    }

    public void setF44(Double f44) {
        this.f44 = f44;
    }

    public Double getF45() {
        return f45;
    }

    public void setF45(Double f45) {
        this.f45 = f45;
    }

    public Double getF46() {
        return f46;
    }

    public void setF46(Double f46) {
        this.f46 = f46;
    }

    public Double getF47() {
        return f47;
    }

    public void setF47(Double f47) {
        this.f47 = f47;
    }

    public Double getF48() {
        return f48;
    }

    public void setF48(Double f48) {
        this.f48 = f48;
    }

    public Double getF49() {
        return f49;
    }

    public void setF49(Double f49) {
        this.f49 = f49;
    }

    public Double getF50() {
        return f50;
    }

    public void setF50(Double f50) {
        this.f50 = f50;
    }

    public Double getF51() {
        return f51;
    }

    public void setF51(Double f51) {
        this.f51 = f51;
    }

    public Double getF52() {
        return f52;
    }

    public void setF52(Double f52) {
        this.f52 = f52;
    }

    public Double getF53() {
        return f53;
    }

    public void setF53(Double f53) {
        this.f53 = f53;
    }

    public Double getF54() {
        return f54;
    }

    public void setF54(Double f54) {
        this.f54 = f54;
    }

    public Double getF55() {
        return f55;
    }

    public void setF55(Double f55) {
        this.f55 = f55;
    }

    public Double getF56() {
        return f56;
    }

    public void setF56(Double f56) {
        this.f56 = f56;
    }

    public Double getF57() {
        return f57;
    }

    public void setF57(Double f57) {
        this.f57 = f57;
    }

    public Double getF58() {
        return f58;
    }

    public void setF58(Double f58) {
        this.f58 = f58;
    }

    public Double getF59() {
        return f59;
    }

    public void setF59(Double f59) {
        this.f59 = f59;
    }

    public Double getF60() {
        return f60;
    }

    public void setF60(Double f60) {
        this.f60 = f60;
    }

    public Double getF61() {
        return f61;
    }

    public void setF61(Double f61) {
        this.f61 = f61;
    }

    public Double getF62() {
        return f62;
    }

    public void setF62(Double f62) {
        this.f62 = f62;
    }

    public Double getF63() {
        return f63;
    }

    public void setF63(Double f63) {
        this.f63 = f63;
    }

    public Double getF64() {
        return f64;
    }

    public void setF64(Double f64) {
        this.f64 = f64;
    }

    public Double getF65() {
        return f65;
    }

    public void setF65(Double f65) {
        this.f65 = f65;
    }

    public Double getF66() {
        return f66;
    }

    public void setF66(Double f66) {
        this.f66 = f66;
    }

    public Double getF67() {
        return f67;
    }

    public void setF67(Double f67) {
        this.f67 = f67;
    }

    public Double getF68() {
        return f68;
    }

    public void setF68(Double f68) {
        this.f68 = f68;
    }

    public Double getF69() {
        return f69;
    }

    public void setF69(Double f69) {
        this.f69 = f69;
    }

    public Double getF70() {
        return f70;
    }

    public void setF70(Double f70) {
        this.f70 = f70;
    }

    public Double getF71() {
        return f71;
    }

    public void setF71(Double f71) {
        this.f71 = f71;
    }

    public Double getF72() {
        return f72;
    }

    public void setF72(Double f72) {
        this.f72 = f72;
    }

    public Double getF73() {
        return f73;
    }

    public void setF73(Double f73) {
        this.f73 = f73;
    }

    public Double getF74() {
        return f74;
    }

    public void setF74(Double f74) {
        this.f74 = f74;
    }

    public Double getF75() {
        return f75;
    }

    public void setF75(Double f75) {
        this.f75 = f75;
    }

    public Double getF76() {
        return f76;
    }

    public void setF76(Double f76) {
        this.f76 = f76;
    }

    public Double getF77() {
        return f77;
    }

    public void setF77(Double f77) {
        this.f77 = f77;
    }

    public Double getF78() {
        return f78;
    }

    public void setF78(Double f78) {
        this.f78 = f78;
    }

    public Double getF79() {
        return f79;
    }

    public void setF79(Double f79) {
        this.f79 = f79;
    }

    public Double getF80() {
        return f80;
    }

    public void setF80(Double f80) {
        this.f80 = f80;
    }

    public Double getF81() {
        return f81;
    }

    public void setF81(Double f81) {
        this.f81 = f81;
    }

    public Double getF82() {
        return f82;
    }

    public void setF82(Double f82) {
        this.f82 = f82;
    }

    public Double getF83() {
        return f83;
    }

    public void setF83(Double f83) {
        this.f83 = f83;
    }

    public Double getF84() {
        return f84;
    }

    public void setF84(Double f84) {
        this.f84 = f84;
    }

    public Double getF85() {
        return f85;
    }

    public void setF85(Double f85) {
        this.f85 = f85;
    }

    public Double getF86() {
        return f86;
    }

    public void setF86(Double f86) {
        this.f86 = f86;
    }

    public Double getF87() {
        return f87;
    }

    public void setF87(Double f87) {
        this.f87 = f87;
    }

    public Double getF88() {
        return f88;
    }

    public void setF88(Double f88) {
        this.f88 = f88;
    }

    public Double getF89() {
        return f89;
    }

    public void setF89(Double f89) {
        this.f89 = f89;
    }

    public Double getF90() {
        return f90;
    }

    public void setF90(Double f90) {
        this.f90 = f90;
    }

    public Double getF91() {
        return f91;
    }

    public void setF91(Double f91) {
        this.f91 = f91;
    }

    public Double getF92() {
        return f92;
    }

    public void setF92(Double f92) {
        this.f92 = f92;
    }

    public Double getF93() {
        return f93;
    }

    public void setF93(Double f93) {
        this.f93 = f93;
    }

    public Double getF94() {
        return f94;
    }

    public void setF94(Double f94) {
        this.f94 = f94;
    }

    public Double getF95() {
        return f95;
    }

    public void setF95(Double f95) {
        this.f95 = f95;
    }

    /**
     * 获取96点值
     *
     * @return
     */
    public Vector<Double> getVectorH96() {
        if(h01!=null && h48!=null && h96!=null){
                vector96 = new Vector<Double>();
                vector96.add(h01);
                vector96.add(h02);
                vector96.add(h03);
                vector96.add(h04);
                vector96.add(h05);
                vector96.add(h06);
                vector96.add(h07);
                vector96.add(h08);
                vector96.add(h09);
                vector96.add(h10);

                vector96.add(h11);
                vector96.add(h12);
                vector96.add(h13);
                vector96.add(h14);
                vector96.add(h15);
                vector96.add(h16);
                vector96.add(h17);
                vector96.add(h18);
                vector96.add(h19);
                vector96.add(h20);

                vector96.add(h21);
                vector96.add(h22);
                vector96.add(h23);
                vector96.add(h24);
                vector96.add(h25);
                vector96.add(h26);
                vector96.add(h27);
                vector96.add(h28);
                vector96.add(h29);
                vector96.add(h30);

                vector96.add(h31);
                vector96.add(h32);
                vector96.add(h33);
                vector96.add(h34);
                vector96.add(h35);
                vector96.add(h36);
                vector96.add(h37);
                vector96.add(h38);
                vector96.add(h39);
                vector96.add(h40);

                vector96.add(h41);
                vector96.add(h42);
                vector96.add(h43);
                vector96.add(h44);
                vector96.add(h45);
                vector96.add(h46);
                vector96.add(h47);
                vector96.add(h48);
                vector96.add(h49);
                vector96.add(h50);

                vector96.add(h51);
                vector96.add(h52);
                vector96.add(h53);
                vector96.add(h54);
                vector96.add(h55);
                vector96.add(h56);
                vector96.add(h57);
                vector96.add(h58);
                vector96.add(h59);
                vector96.add(h60);

                vector96.add(h61);
                vector96.add(h62);
                vector96.add(h63);
                vector96.add(h64);
                vector96.add(h65);
                vector96.add(h66);
                vector96.add(h67);
                vector96.add(h68);
                vector96.add(h69);
                vector96.add(h70);

                vector96.add(h71);
                vector96.add(h72);
                vector96.add(h73);
                vector96.add(h74);
                vector96.add(h75);
                vector96.add(h76);
                vector96.add(h77);
                vector96.add(h78);
                vector96.add(h79);
                vector96.add(h80);

                vector96.add(h81);
                vector96.add(h82);
                vector96.add(h83);
                vector96.add(h84);
                vector96.add(h85);
                vector96.add(h86);
                vector96.add(h87);
                vector96.add(h88);
                vector96.add(h89);
                vector96.add(h90);

                vector96.add(h91);
                vector96.add(h92);
                vector96.add(h93);
                vector96.add(h94);
                vector96.add(h95);
                vector96.add(h96);
            }
            else {
                for(int i=0;i<96;i++){
                    vector96=new Vector<Double>();
                    vector96.add(0.0);
                }
            }

        
        return vector96;
    }

    public Double getL01() {
        return l01;
    }

    public void setL01(Double l01) {
        this.l01 = l01;
    }

    public Double getL02() {
        return l02;
    }

    public void setL02(Double l02) {
        this.l02 = l02;
    }

    public Double getL03() {
        return l03;
    }

    public void setL03(Double l03) {
        this.l03 = l03;
    }

    public Double getL04() {
        return l04;
    }

    public void setL04(Double l04) {
        this.l04 = l04;
    }

    public Double getL05() {
        return l05;
    }

    public void setL05(Double l05) {
        this.l05 = l05;
    }

    public Double getL06() {
        return l06;
    }

    public void setL06(Double l06) {
        this.l06 = l06;
    }

    public Double getL07() {
        return l07;
    }

    public void setL07(Double l07) {
        this.l07 = l07;
    }

    public Double getL08() {
        return l08;
    }

    public void setL08(Double l08) {
        this.l08 = l08;
    }

    public Double getL09() {
        return l09;
    }

    public void setL09(Double l09) {
        this.l09 = l09;
    }

    public Double getL10() {
        return l10;
    }

    public void setL10(Double l10) {
        this.l10 = l10;
    }

    public Double getL11() {
        return l11;
    }

    public void setL11(Double l11) {
        this.l11 = l11;
    }

    public Double getL12() {
        return l12;
    }

    public void setL12(Double l12) {
        this.l12 = l12;
    }

    public Double getL13() {
        return l13;
    }

    public void setL13(Double l13) {
        this.l13 = l13;
    }

    public Double getL14() {
        return l14;
    }

    public void setL14(Double l14) {
        this.l14 = l14;
    }

    public Double getL15() {
        return l15;
    }

    public void setL15(Double l15) {
        this.l15 = l15;
    }

    public Double getL16() {
        return l16;
    }

    public void setL16(Double l16) {
        this.l16 = l16;
    }

    public Double getL17() {
        return l17;
    }

    public void setL17(Double l17) {
        this.l17 = l17;
    }

    public Double getL18() {
        return l18;
    }

    public void setL18(Double l18) {
        this.l18 = l18;
    }

    public Double getL19() {
        return l19;
    }

    public void setL19(Double l19) {
        this.l19 = l19;
    }

    public Double getL20() {
        return l20;
    }

    public void setL20(Double l20) {
        this.l20 = l20;
    }

    public Double getL21() {
        return l21;
    }

    public void setL21(Double l21) {
        this.l21 = l21;
    }

    public Double getL22() {
        return l22;
    }

    public void setL22(Double l22) {
        this.l22 = l22;
    }

    public Double getL23() {
        return l23;
    }

    public void setL23(Double l23) {
        this.l23 = l23;
    }

    public Double getL24() {
        return l24;
    }

    public void setL24(Double l24) {
        this.l24 = l24;
    }

    public Double getL25() {
        return l25;
    }

    public void setL25(Double l25) {
        this.l25 = l25;
    }

    public Double getL26() {
        return l26;
    }

    public void setL26(Double l26) {
        this.l26 = l26;
    }

    public Double getL27() {
        return l27;
    }

    public void setL27(Double l27) {
        this.l27 = l27;
    }

    public Double getL28() {
        return l28;
    }

    public void setL28(Double l28) {
        this.l28 = l28;
    }

    public Double getL29() {
        return l29;
    }

    public void setL29(Double l29) {
        this.l29 = l29;
    }

    public Double getL30() {
        return l30;
    }

    public void setL30(Double l30) {
        this.l30 = l30;
    }

    public Double getL31() {
        return l31;
    }

    public void setL31(Double l31) {
        this.l31 = l31;
    }

    public Double getL32() {
        return l32;
    }

    public void setL32(Double l32) {
        this.l32 = l32;
    }

    public Double getL33() {
        return l33;
    }

    public void setL33(Double l33) {
        this.l33 = l33;
    }

    public Double getL34() {
        return l34;
    }

    public void setL34(Double l34) {
        this.l34 = l34;
    }

    public Double getL35() {
        return l35;
    }

    public void setL35(Double l35) {
        this.l35 = l35;
    }

    public Double getL36() {
        return l36;
    }

    public void setL36(Double l36) {
        this.l36 = l36;
    }

    public Double getL37() {
        return l37;
    }

    public void setL37(Double l37) {
        this.l37 = l37;
    }

    public Double getL38() {
        return l38;
    }

    public void setL38(Double l38) {
        this.l38 = l38;
    }

    public Double getL39() {
        return l39;
    }

    public void setL39(Double l39) {
        this.l39 = l39;
    }

    public Double getL40() {
        return l40;
    }

    public void setL40(Double l40) {
        this.l40 = l40;
    }

    public Double getL41() {
        return l41;
    }

    public void setL41(Double l41) {
        this.l41 = l41;
    }

    public Double getL42() {
        return l42;
    }

    public void setL42(Double l42) {
        this.l42 = l42;
    }

    public Double getL43() {
        return l43;
    }

    public void setL43(Double l43) {
        this.l43 = l43;
    }

    public Double getL44() {
        return l44;
    }

    public void setL44(Double l44) {
        this.l44 = l44;
    }

    public Double getL45() {
        return l45;
    }

    public void setL45(Double l45) {
        this.l45 = l45;
    }

    public Double getL46() {
        return l46;
    }

    public void setL46(Double l46) {
        this.l46 = l46;
    }

    public Double getL47() {
        return l47;
    }

    public void setL47(Double l47) {
        this.l47 = l47;
    }

    public Double getL48() {
        return l48;
    }

    public void setL48(Double l48) {
        this.l48 = l48;
    }

    public Double getL49() {
        return l49;
    }

    public void setL49(Double l49) {
        this.l49 = l49;
    }

    public Double getL50() {
        return l50;
    }

    public void setL50(Double l50) {
        this.l50 = l50;
    }

    public Double getL51() {
        return l51;
    }

    public void setL51(Double l51) {
        this.l51 = l51;
    }

    public Double getL52() {
        return l52;
    }

    public void setL52(Double l52) {
        this.l52 = l52;
    }

    public Double getL53() {
        return l53;
    }

    public void setL53(Double l53) {
        this.l53 = l53;
    }

    public Double getL54() {
        return l54;
    }

    public void setL54(Double l54) {
        this.l54 = l54;
    }

    public Double getL55() {
        return l55;
    }

    public void setL55(Double l55) {
        this.l55 = l55;
    }

    public Double getL56() {
        return l56;
    }

    public void setL56(Double l56) {
        this.l56 = l56;
    }

    public Double getL57() {
        return l57;
    }

    public void setL57(Double l57) {
        this.l57 = l57;
    }

    public Double getL58() {
        return l58;
    }

    public void setL58(Double l58) {
        this.l58 = l58;
    }

    public Double getL59() {
        return l59;
    }

    public void setL59(Double l59) {
        this.l59 = l59;
    }

    public Double getL60() {
        return l60;
    }

    public void setL60(Double l60) {
        this.l60 = l60;
    }

    public Double getL61() {
        return l61;
    }

    public void setL61(Double l61) {
        this.l61 = l61;
    }

    public Double getL62() {
        return l62;
    }

    public void setL62(Double l62) {
        this.l62 = l62;
    }

    public Double getL63() {
        return l63;
    }

    public void setL63(Double l63) {
        this.l63 = l63;
    }

    public Double getL64() {
        return l64;
    }

    public void setL64(Double l64) {
        this.l64 = l64;
    }

    public Double getL65() {
        return l65;
    }

    public void setL65(Double l65) {
        this.l65 = l65;
    }

    public Double getL66() {
        return l66;
    }

    public void setL66(Double l66) {
        this.l66 = l66;
    }

    public Double getL67() {
        return l67;
    }

    public void setL67(Double l67) {
        this.l67 = l67;
    }

    public Double getL68() {
        return l68;
    }

    public void setL68(Double l68) {
        this.l68 = l68;
    }

    public Double getL69() {
        return l69;
    }

    public void setL69(Double l69) {
        this.l69 = l69;
    }

    public Double getL70() {
        return l70;
    }

    public void setL70(Double l70) {
        this.l70 = l70;
    }

    public Double getL71() {
        return l71;
    }

    public void setL71(Double l71) {
        this.l71 = l71;
    }

    public Double getL72() {
        return l72;
    }

    public void setL72(Double l72) {
        this.l72 = l72;
    }

    public Double getL73() {
        return l73;
    }

    public void setL73(Double l73) {
        this.l73 = l73;
    }

    public Double getL74() {
        return l74;
    }

    public void setL74(Double l74) {
        this.l74 = l74;
    }

    public Double getL75() {
        return l75;
    }

    public void setL75(Double l75) {
        this.l75 = l75;
    }

    public Double getL76() {
        return l76;
    }

    public void setL76(Double l76) {
        this.l76 = l76;
    }

    public Double getL77() {
        return l77;
    }

    public void setL77(Double l77) {
        this.l77 = l77;
    }

    public Double getL78() {
        return l78;
    }

    public void setL78(Double l78) {
        this.l78 = l78;
    }

    public Double getL79() {
        return l79;
    }

    public void setL79(Double l79) {
        this.l79 = l79;
    }

    public Double getL80() {
        return l80;
    }

    public void setL80(Double l80) {
        this.l80 = l80;
    }

    public Double getL81() {
        return l81;
    }

    public void setL81(Double l81) {
        this.l81 = l81;
    }

    public Double getL82() {
        return l82;
    }

    public void setL82(Double l82) {
        this.l82 = l82;
    }

    public Double getL83() {
        return l83;
    }

    public void setL83(Double l83) {
        this.l83 = l83;
    }

    public Double getL84() {
        return l84;
    }

    public void setL84(Double l84) {
        this.l84 = l84;
    }

    public Double getL85() {
        return l85;
    }

    public void setL85(Double l85) {
        this.l85 = l85;
    }

    public Double getL86() {
        return l86;
    }

    public void setL86(Double l86) {
        this.l86 = l86;
    }

    public Double getL87() {
        return l87;
    }

    public void setL87(Double l87) {
        this.l87 = l87;
    }

    public Double getL88() {
        return l88;
    }

    public void setL88(Double l88) {
        this.l88 = l88;
    }

    public Double getL89() {
        return l89;
    }

    public void setL89(Double l89) {
        this.l89 = l89;
    }

    public Double getL90() {
        return l90;
    }

    public void setL90(Double l90) {
        this.l90 = l90;
    }

    public Double getL91() {
        return l91;
    }

    public void setL91(Double l91) {
        this.l91 = l91;
    }

    public Double getL92() {
        return l92;
    }

    public void setL92(Double l92) {
        this.l92 = l92;
    }

    public Double getL93() {
        return l93;
    }

    public void setL93(Double l93) {
        this.l93 = l93;
    }

    public Double getL94() {
        return l94;
    }

    public void setL94(Double l94) {
        this.l94 = l94;
    }

    public Double getL95() {
        return l95;
    }

    public void setL95(Double l95) {
        this.l95 = l95;
    }

    public Double getL96() {
        return l96;
    }

    public void setL96(Double l96) {
        this.l96 = l96;
    }

    public void setVectorH96(Vector<Double> vector96) {
        this.vector96 = vector96;
        setH01(vector96.get(0));
        setH02(vector96.get(1));
        setH03(vector96.get(2));
        setH04(vector96.get(3));
        setH05(vector96.get(4));
        setH06(vector96.get(5));
        setH07(vector96.get(6));
        setH08(vector96.get(7));
        setH09(vector96.get(8));
        setH10(vector96.get(9));

        setH11(vector96.get(10));
        setH12(vector96.get(11));
        setH13(vector96.get(12));
        setH14(vector96.get(13));
        setH15(vector96.get(14));
        setH16(vector96.get(15));
        setH17(vector96.get(16));
        setH18(vector96.get(17));
        setH19(vector96.get(18));
        setH20(vector96.get(19));

        setH21(vector96.get(20));
        setH22(vector96.get(21));
        setH23(vector96.get(22));
        setH24(vector96.get(23));
        setH25(vector96.get(24));
        setH26(vector96.get(25));
        setH27(vector96.get(26));
        setH28(vector96.get(27));
        setH29(vector96.get(28));
        setH30(vector96.get(29));

        setH31(vector96.get(30));
        setH32(vector96.get(31));
        setH33(vector96.get(32));
        setH34(vector96.get(33));
        setH35(vector96.get(34));
        setH36(vector96.get(35));
        setH37(vector96.get(36));
        setH38(vector96.get(37));
        setH39(vector96.get(38));
        setH40(vector96.get(39));

        setH41(vector96.get(40));
        setH42(vector96.get(41));
        setH43(vector96.get(42));
        setH44(vector96.get(43));
        setH45(vector96.get(44));
        setH46(vector96.get(45));
        setH47(vector96.get(46));
        setH48(vector96.get(47));
        setH49(vector96.get(48));
        setH50(vector96.get(49));

        setH51(vector96.get(50));
        setH52(vector96.get(51));
        setH53(vector96.get(52));
        setH54(vector96.get(53));
        setH55(vector96.get(54));
        setH56(vector96.get(55));
        setH57(vector96.get(56));
        setH58(vector96.get(57));
        setH59(vector96.get(58));
        setH60(vector96.get(59));

        setH61(vector96.get(60));
        setH62(vector96.get(61));
        setH63(vector96.get(62));
        setH64(vector96.get(63));
        setH65(vector96.get(64));
        setH66(vector96.get(65));
        setH67(vector96.get(66));
        setH68(vector96.get(67));
        setH69(vector96.get(68));
        setH70(vector96.get(69));

        setH71(vector96.get(70));
        setH72(vector96.get(71));
        setH73(vector96.get(72));
        setH74(vector96.get(73));
        setH75(vector96.get(74));
        setH76(vector96.get(75));
        setH77(vector96.get(76));
        setH78(vector96.get(77));
        setH79(vector96.get(78));
        setH80(vector96.get(79));

        setH81(vector96.get(80));
        setH82(vector96.get(81));
        setH83(vector96.get(82));
        setH84(vector96.get(83));
        setH85(vector96.get(84));
        setH86(vector96.get(85));
        setH87(vector96.get(86));
        setH88(vector96.get(87));
        setH89(vector96.get(88));
        setH90(vector96.get(89));

        setH91(vector96.get(90));
        setH92(vector96.get(91));
        setH93(vector96.get(92));
        setH94(vector96.get(93));
        setH95(vector96.get(94));
        setH96(vector96.get(95));

    }

    private Vector<Integer> vectorV96 = null;

    private Integer v01;
    private Integer v02;
    private Integer v03;
    private Integer v04;
    private Integer v05;
    private Integer v06;
    private Integer v07;
    private Integer v08;
    private Integer v09;
    private Integer v10;

    private Integer v11;
    private Integer v12;
    private Integer v13;
    private Integer v14;
    private Integer v15;
    private Integer v16;
    private Integer v17;
    private Integer v18;
    private Integer v19;
    private Integer v20;

    private Integer v21;
    private Integer v22;
    private Integer v23;
    private Integer v24;
    private Integer v25;
    private Integer v26;
    private Integer v27;
    private Integer v28;
    private Integer v29;
    private Integer v30;

    private Integer v31;
    private Integer v32;
    private Integer v33;
    private Integer v34;
    private Integer v35;
    private Integer v36;
    private Integer v37;
    private Integer v38;
    private Integer v39;
    private Integer v40;

    private Integer v41;
    private Integer v42;
    private Integer v43;
    private Integer v44;
    private Integer v45;
    private Integer v46;
    private Integer v47;
    private Integer v48;
    private Integer v49;
    private Integer v50;

    private Integer v51;
    private Integer v52;
    private Integer v53;
    private Integer v54;
    private Integer v55;
    private Integer v56;
    private Integer v57;
    private Integer v58;
    private Integer v59;
    private Integer v60;

    private Integer v61;
    private Integer v62;
    private Integer v63;
    private Integer v64;
    private Integer v65;
    private Integer v66;
    private Integer v67;
    private Integer v68;
    private Integer v69;
    private Integer v70;

    private Integer v71;
    private Integer v72;
    private Integer v73;
    private Integer v74;
    private Integer v75;
    private Integer v76;
    private Integer v77;
    private Integer v78;
    private Integer v79;
    private Integer v80;

    private Integer v81;
    private Integer v82;
    private Integer v83;
    private Integer v84;
    private Integer v85;
    private Integer v86;
    private Integer v87;
    private Integer v88;
    private Integer v89;
    private Integer v90;

    private Integer v91;
    private Integer v92;
    private Integer v93;
    private Integer v94;
    private Integer v95;
    private Integer v96;

    public Vector<Double> getVector96() {
        return vector96;
    }

    public void setVector96(Vector<Double> vector96) {
        this.vector96 = vector96;
    }

    public Integer getV01() {
        return v01;
    }

    public void setV01(Integer v01) {
        this.v01 = v01;
    }

    public Integer getV02() {
        return v02;
    }

    public void setV02(Integer v02) {
        this.v02 = v02;
    }

    public Integer getV03() {
        return v03;
    }

    public void setV03(Integer v03) {
        this.v03 = v03;
    }

    public Integer getV04() {
        return v04;
    }

    public void setV04(Integer v04) {
        this.v04 = v04;
    }

    public Integer getV05() {
        return v05;
    }

    public void setV05(Integer v05) {
        this.v05 = v05;
    }

    public Integer getV06() {
        return v06;
    }

    public void setV06(Integer v06) {
        this.v06 = v06;
    }

    public Integer getV07() {
        return v07;
    }

    public void setV07(Integer v07) {
        this.v07 = v07;
    }

    public Integer getV08() {
        return v08;
    }

    public void setV08(Integer v08) {
        this.v08 = v08;
    }

    public Integer getV09() {
        return v09;
    }

    public void setV09(Integer v09) {
        this.v09 = v09;
    }

    public Integer getV10() {
        return v10;
    }

    public void setV10(Integer v10) {
        this.v10 = v10;
    }

    public Integer getV11() {
        return v11;
    }

    public void setV11(Integer v11) {
        this.v11 = v11;
    }

    public Integer getV12() {
        return v12;
    }

    public void setV12(Integer v12) {
        this.v12 = v12;
    }

    public Integer getV13() {
        return v13;
    }

    public void setV13(Integer v13) {
        this.v13 = v13;
    }

    public Integer getV14() {
        return v14;
    }

    public void setV14(Integer v14) {
        this.v14 = v14;
    }

    public Integer getV15() {
        return v15;
    }

    public void setV15(Integer v15) {
        this.v15 = v15;
    }

    public Integer getV16() {
        return v16;
    }

    public void setV16(Integer v16) {
        this.v16 = v16;
    }

    public Integer getV17() {
        return v17;
    }

    public void setV17(Integer v17) {
        this.v17 = v17;
    }

    public Integer getV18() {
        return v18;
    }

    public void setV18(Integer v18) {
        this.v18 = v18;
    }

    public Integer getV19() {
        return v19;
    }

    public void setV19(Integer v19) {
        this.v19 = v19;
    }

    public Integer getV20() {
        return v20;
    }

    public void setV20(Integer v20) {
        this.v20 = v20;
    }

    public Integer getV21() {
        return v21;
    }

    public void setV21(Integer v21) {
        this.v21 = v21;
    }

    public Integer getV22() {
        return v22;
    }

    public void setV22(Integer v22) {
        this.v22 = v22;
    }

    public Integer getV23() {
        return v23;
    }

    public void setV23(Integer v23) {
        this.v23 = v23;
    }

    public Integer getV24() {
        return v24;
    }

    public void setV24(Integer v24) {
        this.v24 = v24;
    }

    public Integer getV25() {
        return v25;
    }

    public void setV25(Integer v25) {
        this.v25 = v25;
    }

    public Integer getV26() {
        return v26;
    }

    public void setV26(Integer v26) {
        this.v26 = v26;
    }

    public Integer getV27() {
        return v27;
    }

    public void setV27(Integer v27) {
        this.v27 = v27;
    }

    public Integer getV28() {
        return v28;
    }

    public void setV28(Integer v28) {
        this.v28 = v28;
    }

    public Integer getV29() {
        return v29;
    }

    public void setV29(Integer v29) {
        this.v29 = v29;
    }

    public Integer getV30() {
        return v30;
    }

    public void setV30(Integer v30) {
        this.v30 = v30;
    }

    public Integer getV31() {
        return v31;
    }

    public void setV31(Integer v31) {
        this.v31 = v31;
    }

    public Integer getV32() {
        return v32;
    }

    public void setV32(Integer v32) {
        this.v32 = v32;
    }

    public Integer getV33() {
        return v33;
    }

    public void setV33(Integer v33) {
        this.v33 = v33;
    }

    public Integer getV34() {
        return v34;
    }

    public void setV34(Integer v34) {
        this.v34 = v34;
    }

    public Integer getV35() {
        return v35;
    }

    public void setV35(Integer v35) {
        this.v35 = v35;
    }

    public Integer getV36() {
        return v36;
    }

    public void setV36(Integer v36) {
        this.v36 = v36;
    }

    public Integer getV37() {
        return v37;
    }

    public void setV37(Integer v37) {
        this.v37 = v37;
    }

    public Integer getV38() {
        return v38;
    }

    public void setV38(Integer v38) {
        this.v38 = v38;
    }

    public Integer getV39() {
        return v39;
    }

    public void setV39(Integer v39) {
        this.v39 = v39;
    }

    public Integer getV40() {
        return v40;
    }

    public void setV40(Integer v40) {
        this.v40 = v40;
    }

    public Integer getV41() {
        return v41;
    }

    public void setV41(Integer v41) {
        this.v41 = v41;
    }

    public Integer getV42() {
        return v42;
    }

    public void setV42(Integer v42) {
        this.v42 = v42;
    }

    public Integer getV43() {
        return v43;
    }

    public void setV43(Integer v43) {
        this.v43 = v43;
    }

    public Integer getV44() {
        return v44;
    }

    public void setV44(Integer v44) {
        this.v44 = v44;
    }

    public Integer getV45() {
        return v45;
    }

    public void setV45(Integer v45) {
        this.v45 = v45;
    }

    public Integer getV46() {
        return v46;
    }

    public void setV46(Integer v46) {
        this.v46 = v46;
    }

    public Integer getV47() {
        return v47;
    }

    public void setV47(Integer v47) {
        this.v47 = v47;
    }

    public Integer getV48() {
        return v48;
    }

    public void setV48(Integer v48) {
        this.v48 = v48;
    }

    public Integer getV49() {
        return v49;
    }

    public void setV49(Integer v49) {
        this.v49 = v49;
    }

    public Integer getV50() {
        return v50;
    }

    public void setV50(Integer v50) {
        this.v50 = v50;
    }

    public Integer getV51() {
        return v51;
    }

    public void setV51(Integer v51) {
        this.v51 = v51;
    }

    public Integer getV52() {
        return v52;
    }

    public void setV52(Integer v52) {
        this.v52 = v52;
    }

    public Integer getV53() {
        return v53;
    }

    public void setV53(Integer v53) {
        this.v53 = v53;
    }

    public Integer getV54() {
        return v54;
    }

    public void setV54(Integer v54) {
        this.v54 = v54;
    }

    public Integer getV55() {
        return v55;
    }

    public void setV55(Integer v55) {
        this.v55 = v55;
    }

    public Integer getV56() {
        return v56;
    }

    public void setV56(Integer v56) {
        this.v56 = v56;
    }

    public Integer getV57() {
        return v57;
    }

    public void setV57(Integer v57) {
        this.v57 = v57;
    }

    public Integer getV58() {
        return v58;
    }

    public void setV58(Integer v58) {
        this.v58 = v58;
    }

    public Integer getV59() {
        return v59;
    }

    public void setV59(Integer v59) {
        this.v59 = v59;
    }

    public Integer getV60() {
        return v60;
    }

    public void setV60(Integer v60) {
        this.v60 = v60;
    }

    public Integer getV61() {
        return v61;
    }

    public void setV61(Integer v61) {
        this.v61 = v61;
    }

    public Integer getV62() {
        return v62;
    }

    public void setV62(Integer v62) {
        this.v62 = v62;
    }

    public Integer getV63() {
        return v63;
    }

    public void setV63(Integer v63) {
        this.v63 = v63;
    }

    public Integer getV64() {
        return v64;
    }

    public void setV64(Integer v64) {
        this.v64 = v64;
    }

    public Integer getV65() {
        return v65;
    }

    public void setV65(Integer v65) {
        this.v65 = v65;
    }

    public Integer getV66() {
        return v66;
    }

    public void setV66(Integer v66) {
        this.v66 = v66;
    }

    public Integer getV67() {
        return v67;
    }

    public void setV67(Integer v67) {
        this.v67 = v67;
    }

    public Integer getV68() {
        return v68;
    }

    public void setV68(Integer v68) {
        this.v68 = v68;
    }

    public Integer getV69() {
        return v69;
    }

    public void setV69(Integer v69) {
        this.v69 = v69;
    }

    public Integer getV70() {
        return v70;
    }

    public void setV70(Integer v70) {
        this.v70 = v70;
    }

    public Integer getV71() {
        return v71;
    }

    public void setV71(Integer v71) {
        this.v71 = v71;
    }

    public Integer getV72() {
        return v72;
    }

    public void setV72(Integer v72) {
        this.v72 = v72;
    }

    public Integer getV73() {
        return v73;
    }

    public void setV73(Integer v73) {
        this.v73 = v73;
    }

    public Integer getV74() {
        return v74;
    }

    public void setV74(Integer v74) {
        this.v74 = v74;
    }

    public Integer getV75() {
        return v75;
    }

    public void setV75(Integer v75) {
        this.v75 = v75;
    }

    public Integer getV76() {
        return v76;
    }

    public void setV76(Integer v76) {
        this.v76 = v76;
    }

    public Integer getV77() {
        return v77;
    }

    public void setV77(Integer v77) {
        this.v77 = v77;
    }

    public Integer getV78() {
        return v78;
    }

    public void setV78(Integer v78) {
        this.v78 = v78;
    }

    public Integer getV79() {
        return v79;
    }

    public void setV79(Integer v79) {
        this.v79 = v79;
    }

    public Integer getV80() {
        return v80;
    }

    public void setV80(Integer v80) {
        this.v80 = v80;
    }

    public Integer getV81() {
        return v81;
    }

    public void setV81(Integer v81) {
        this.v81 = v81;
    }

    public Integer getV82() {
        return v82;
    }

    public void setV82(Integer v82) {
        this.v82 = v82;
    }

    public Integer getV83() {
        return v83;
    }

    public void setV83(Integer v83) {
        this.v83 = v83;
    }

    public Integer getV84() {
        return v84;
    }

    public void setV84(Integer v84) {
        this.v84 = v84;
    }

    public Integer getV85() {
        return v85;
    }

    public void setV85(Integer v85) {
        this.v85 = v85;
    }

    public Integer getV86() {
        return v86;
    }

    public void setV86(Integer v86) {
        this.v86 = v86;
    }

    public Integer getV87() {
        return v87;
    }

    public void setV87(Integer v87) {
        this.v87 = v87;
    }

    public Integer getV88() {
        return v88;
    }

    public void setV88(Integer v88) {
        this.v88 = v88;
    }

    public Integer getV89() {
        return v89;
    }

    public void setV89(Integer v89) {
        this.v89 = v89;
    }

    public Integer getV90() {
        return v90;
    }

    public void setV90(Integer v90) {
        this.v90 = v90;
    }

    public Integer getV91() {
        return v91;
    }

    public void setV91(Integer v91) {
        this.v91 = v91;
    }

    public Integer getV92() {
        return v92;
    }

    public void setV92(Integer v92) {
        this.v92 = v92;
    }

    public Integer getV93() {
        return v93;
    }

    public void setV93(Integer v93) {
        this.v93 = v93;
    }

    public Integer getV94() {
        return v94;
    }

    public void setV94(Integer v94) {
        this.v94 = v94;
    }

    public Integer getV95() {
        return v95;
    }

    public void setV95(Integer v95) {
        this.v95 = v95;
    }

    public Integer getV96() {
        return v96;
    }

    public void setV96(Integer v96) {
        this.v96 = v96;
    }

    /**
     * 获取96点值
     *
     * @return
     */
    public Vector<Integer> getVectorV96() {
        vectorV96 = new Vector<Integer>();
        vectorV96.add(v01);
        vectorV96.add(v02);
        vectorV96.add(v03);
        vectorV96.add(v04);
        vectorV96.add(v05);
        vectorV96.add(v06);
        vectorV96.add(v07);
        vectorV96.add(v08);
        vectorV96.add(v09);
        vectorV96.add(v10);

        vectorV96.add(v11);
        vectorV96.add(v12);
        vectorV96.add(v13);
        vectorV96.add(v14);
        vectorV96.add(v15);
        vectorV96.add(v16);
        vectorV96.add(v17);
        vectorV96.add(v18);
        vectorV96.add(v19);
        vectorV96.add(v20);

        vectorV96.add(v21);
        vectorV96.add(v22);
        vectorV96.add(v23);
        vectorV96.add(v24);
        vectorV96.add(v25);
        vectorV96.add(v26);
        vectorV96.add(v27);
        vectorV96.add(v28);
        vectorV96.add(v29);
        vectorV96.add(v30);

        vectorV96.add(v41);
        vectorV96.add(v42);
        vectorV96.add(v43);
        vectorV96.add(v44);
        vectorV96.add(v45);
        vectorV96.add(v46);
        vectorV96.add(v47);
        vectorV96.add(v48);
        vectorV96.add(v49);
        vectorV96.add(v50);

        vectorV96.add(v51);
        vectorV96.add(v52);
        vectorV96.add(v53);
        vectorV96.add(v54);
        vectorV96.add(v55);
        vectorV96.add(v56);
        vectorV96.add(v57);
        vectorV96.add(v58);
        vectorV96.add(v59);
        vectorV96.add(v60);

        vectorV96.add(v61);
        vectorV96.add(v62);
        vectorV96.add(v63);
        vectorV96.add(v64);
        vectorV96.add(v65);
        vectorV96.add(v66);
        vectorV96.add(v67);
        vectorV96.add(v68);
        vectorV96.add(v69);
        vectorV96.add(v70);

        vectorV96.add(v71);
        vectorV96.add(v72);
        vectorV96.add(v73);
        vectorV96.add(v74);
        vectorV96.add(v75);
        vectorV96.add(v76);
        vectorV96.add(v77);
        vectorV96.add(v78);
        vectorV96.add(v79);
        vectorV96.add(v80);

        vectorV96.add(v81);
        vectorV96.add(v82);
        vectorV96.add(v83);
        vectorV96.add(v84);
        vectorV96.add(v85);
        vectorV96.add(v86);
        vectorV96.add(v87);
        vectorV96.add(v88);
        vectorV96.add(v89);
        vectorV96.add(v90);

        vectorV96.add(v91);
        vectorV96.add(v92);
        vectorV96.add(v93);
        vectorV96.add(v94);
        vectorV96.add(v95);
        vectorV96.add(v96);

        return vectorV96;
    }

    public void setVectorV96(Vector<Integer> vectorV96) {
        this.vectorV96 = vectorV96;
        setV01(vectorV96.get(0));
        setV02(vectorV96.get(1));
        setV03(vectorV96.get(2));
        setV04(vectorV96.get(3));
        setV05(vectorV96.get(4));
        setV06(vectorV96.get(5));
        setV07(vectorV96.get(6));
        setV08(vectorV96.get(7));
        setV09(vectorV96.get(8));
        setV10(vectorV96.get(9));

        setV11(vectorV96.get(10));
        setV12(vectorV96.get(11));
        setV13(vectorV96.get(12));
        setV14(vectorV96.get(13));
        setV15(vectorV96.get(14));
        setV16(vectorV96.get(15));
        setV17(vectorV96.get(16));
        setV18(vectorV96.get(17));
        setV19(vectorV96.get(18));
        setV20(vectorV96.get(19));

        setV21(vectorV96.get(20));
        setV22(vectorV96.get(21));
        setV23(vectorV96.get(22));
        setV24(vectorV96.get(23));
        setV25(vectorV96.get(24));
        setV26(vectorV96.get(25));
        setV27(vectorV96.get(26));
        setV28(vectorV96.get(27));
        setV29(vectorV96.get(28));
        setV30(vectorV96.get(29));

        setV31(vectorV96.get(30));
        setV32(vectorV96.get(31));
        setV33(vectorV96.get(32));
        setV34(vectorV96.get(33));
        setV35(vectorV96.get(34));
        setV36(vectorV96.get(35));
        setV37(vectorV96.get(36));
        setV38(vectorV96.get(37));
        setV39(vectorV96.get(38));
        setV40(vectorV96.get(39));

        setV41(vectorV96.get(40));
        setV42(vectorV96.get(41));
        setV43(vectorV96.get(42));
        setV44(vectorV96.get(43));
        setV45(vectorV96.get(44));
        setV46(vectorV96.get(45));
        setV47(vectorV96.get(46));
        setV48(vectorV96.get(47));
        setV49(vectorV96.get(48));
        setV50(vectorV96.get(49));

        setV51(vectorV96.get(50));
        setV52(vectorV96.get(51));
        setV53(vectorV96.get(52));
        setV54(vectorV96.get(53));
        setV55(vectorV96.get(54));
        setV56(vectorV96.get(55));
        setV57(vectorV96.get(56));
        setV58(vectorV96.get(57));
        setV59(vectorV96.get(58));
        setV60(vectorV96.get(59));

        setV61(vectorV96.get(60));
        setV62(vectorV96.get(61));
        setV63(vectorV96.get(62));
        setV64(vectorV96.get(63));
        setV65(vectorV96.get(64));
        setV66(vectorV96.get(65));
        setV67(vectorV96.get(66));
        setV68(vectorV96.get(67));
        setV69(vectorV96.get(68));
        setV70(vectorV96.get(69));

        setV71(vectorV96.get(70));
        setV72(vectorV96.get(71));
        setV73(vectorV96.get(72));
        setV74(vectorV96.get(73));
        setV75(vectorV96.get(74));
        setV76(vectorV96.get(75));
        setV77(vectorV96.get(76));
        setV78(vectorV96.get(77));
        setV79(vectorV96.get(78));
        setV80(vectorV96.get(79));

        setV81(vectorV96.get(80));
        setV82(vectorV96.get(81));
        setV83(vectorV96.get(82));
        setV84(vectorV96.get(83));
        setV85(vectorV96.get(84));
        setV86(vectorV96.get(85));
        setV87(vectorV96.get(86));
        setV88(vectorV96.get(87));
        setV89(vectorV96.get(88));
        setV90(vectorV96.get(89));

        setV91(vectorV96.get(90));
        setV92(vectorV96.get(91));
        setV93(vectorV96.get(92));
        setV94(vectorV96.get(93));
        setV95(vectorV96.get(94));
        setV96(vectorV96.get(95));

    }

    /**
     * 返回96点值
     *
     * @param bean
     * @return
     */
    public static Vector<Double> getVectorF96(BasicBean bean) {
        Vector<Double> unitVector = new Vector<Double>();
        Field[] fields = BasicBean.class.getDeclaredFields();
        for (Field field : fields) {
            if (field.getName().startsWith("f")) {
                field.setAccessible(true);
                try {
                    Field lineField = BasicBean.class.getDeclaredField(field.getName());
                    lineField.setAccessible(true);
                    Double hh = (Double) lineField.get(bean);
                    unitVector.add(hh);
                } catch (IllegalArgumentException e) {
                    
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    
                    e.printStackTrace();
                } catch (SecurityException e) {
                    
                    e.printStackTrace();
                } catch (NoSuchFieldException e) {
                    
                    e.printStackTrace();
                }
            }
        }

        return unitVector;

    }


    public static Vector<Double> getVectorL96(BasicBean bean) {
        Vector<Double> unitVector = new Vector<Double>();
        Field[] fields = BasicBean.class.getDeclaredFields();
        for (Field field : fields) {
            if (field.getName().startsWith("l")) {
                field.setAccessible(true);
                try {
                    Field lineField = BasicBean.class.getDeclaredField(field.getName());
                    lineField.setAccessible(true);
                    Double hh = (Double) lineField.get(bean);
                    unitVector.add(hh);
                } catch (IllegalArgumentException e) {
                    
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    
                    e.printStackTrace();
                } catch (SecurityException e) {
                    
                    e.printStackTrace();
                } catch (NoSuchFieldException e) {
                    
                    e.printStackTrace();
                }
            }
        }

        return unitVector;

    }

    public String getMdate() {
        return mdate;
    }

    public void setMdate(String mdate) {
        this.mdate = mdate;
    }

    public void setCurPoint(Integer curPoint) {
        this.curPoint = curPoint;
    }
}
