/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import javax.annotation.Nonnull;

/**
 * A QEmu Machine.
 * 
 * If your machine isn't present, you may use a {@link QEmuCustomOption} instead.
 *
 * @author shevek
 */
public enum QEmuMachine {

    akita("akita"),
    an5206("an5206"),
    axis_dev88("axis-dev88"),
    bamboo("bamboo"),
    borzoi("borzoi"),
    canon_a1100("canon-a1100"),
    cheetah("cheetah"),
    clipper("clipper"),
    collie("collie"),
    connex("connex"),
    cubieboard("cubieboard"),
    dummy("dummy"),
    fulong2e("fulong2e"),
    g3beige("g3beige"),
    highbank("highbank"),
    integratorcp("integratorcp"),
    isapc("isapc"),
    kc705("kc705"),
    kzm("kzm"),
    leon3_generic("leon3_generic"),
    lm32_evr("lm32-evr"),
    lm32_uclinux("lm32-uclinux"),
    lm3s6965evb("lm3s6965evb"),
    lm3s811evb("lm3s811evb"),
    LX("LX"),
    lx200("lx200"),
    lx60("lx60"),
    mac99("mac99"),
    magnum("magnum"),
    mainstone("mainstone"),
    malta("malta"),
    mcf5208evb("mcf5208evb"),
    midway("midway"),
    milkymist("milkymist"),
    mips("mips"),
    mipssim("mipssim"),
    ml605("ml605"),
    moxiesim("moxiesim"),
    mpc8544ds("mpc8544ds"),
    musicpal("musicpal"),
    n800("n800"),
    n810("n810"),
    Niagara("Niagara"),
    none("none"),
    nuri("nuri"),
    or32_sim("or32-sim"),
    pc("pc"),
    pc_0_10("pc-0.10"),
    pc_0_11("pc-0.11"),
    pc_0_12("pc-0.12"),
    pc_0_13("pc-0.13"),
    pc_0_14("pc-0.14"),
    pc_0_15("pc-0.15"),
    pc_1_0("pc-1.0"),
    pc_1_1("pc-1.1"),
    pc_1_2("pc-1.2"),
    pc_1_3("pc-1.3"),
    pc_i440fx_1_4("pc-i440fx-1.4"),
    pc_i440fx_1_5("pc-i440fx-1.5"),
    pc_i440fx_1_6("pc-i440fx-1.6"),
    pc_i440fx_1_7("pc-i440fx-1.7"),
    pc_i440fx_2_0("pc-i440fx-2.0"),
    pc_i440fx_trusty("pc-i440fx-trusty"),
    pc_q35_1_4("pc-q35-1.4"),
    pc_q35_1_5("pc-q35-1.5"),
    pc_q35_1_6("pc-q35-1.6"),
    pc_q35_1_7("pc-q35-1.7"),
    pc_q35_2_0("pc-q35-2.0"),
    petalogix_ml605("petalogix-ml605"),
    petalogix_s3adsp1800("petalogix-s3adsp1800"),
    pica61("pica61"),
    ppce500("ppce500"),
    prep("prep"),
    pseries("pseries"),
    puv3("puv3"),
    q35("q35"),
    r2d("r2d"),
    realview_eb("realview-eb"),
    realview_eb_mpcore("realview-eb-mpcore"),
    realview_pb_a8("realview-pb-a8"),
    realview_pbx_a9("realview-pbx-a9"),
    ref405ep("ref405ep"),
    s390("s390"),
    s390_ccw("s390-ccw"),
    s390_ccw_virtio("s390-ccw-virtio"),
    s390_virtio("s390-virtio"),
    shix("shix"),
    sim("sim"),
    smdkc210("smdkc210"),
    SPARCbook("SPARCbook"),
    SPARCClassic("SPARCClassic"),
    spitz("spitz"),
    SS_10("SS-10"),
    SS_20("SS-20"),
    SS_4("SS-4"),
    SS_5("SS-5"),
    SS_600MP("SS-600MP"),
    sun4u("sun4u"),
    sun4v("sun4v"),
    sx1("sx1"),
    sx1_v1("sx1-v1"),
    taihu("taihu"),
    terrier("terrier"),
    tosa("tosa"),
    verdex("verdex"),
    versatileab("versatileab"),
    versatilepb("versatilepb"),
    vexpress_a15("vexpress-a15"),
    vexpress_a9("vexpress-a9"),
    virt("virt"),
    virtex_ml507("virtex-ml507"),
    Voyager("Voyager"),
    xenfv("xenfv"),
    xenpv("xenpv"),
    xilinx_zynq_a9("xilinx-zynq-a9"),
    z2("z2");
    private String text;

    private QEmuMachine(@Nonnull String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
