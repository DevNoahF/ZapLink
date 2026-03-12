package com.example.zaplink.dto.enums;

import lombok.Getter;

@Getter
public enum DddEnum {
        // Sudeste
    //sp
        SP_11(11, "São Paulo"),
        SP_12(12, "São José dos Campos"),
        SP_13(13, "Santos"),
        SP_14(14, "Marília/Bauru"),
        SP_15(15, "Sorocaba"),
        SP_16(16, "Ribeirão Preto"),
        SP_17(17, "São José do Rio Preto"),
        SP_18(18, "Presidente Prudente"),
        SP_19(19, "Campinas"),

    // rj
        RJ_21(21, "Rio de Janeiro"),
        RJ_22(22, "Campos dos Goytacazes"),
        RJ_24(24, "Petrópolis"),
        ES_27(27, "Vitória"),
        ES_28(28, "Cachoeiro de Itapemirim"),
        MG_31(31, "Belo Horizonte"),
        MG_32(32, "Juiz de Fora"),
        MG_33(33, "Governador Valadares"),
        MG_34(34, "Uberlândia"),
        MG_35(35, "Poços de Caldas"),
        MG_37(37, "Divinópolis"),
        MG_38(38, "Montes Claros"),

        // Sul
    //pr
        PR_41(41, "Curitiba"),
        PR_42(42, "Ponta Grossa"),
        PR_43(43, "Londrina"),
        PR_44(44, "Maringá"),
        PR_45(45, "Cascavel"),
        PR_46(46, "Francisco Beltrão"),
    //sc
        SC_47(47, "Joinville"),
        SC_48(48, "Florianópolis"),
        SC_49(49, "Chapecó"),
    //rs
        RS_51(51, "Porto Alegre"),
        RS_53(53, "Pelotas"),
        RS_54(54, "Caxias do Sul"),
        RS_55(55, "Santa Maria"),

        // Centro-Oeste
        DF_61(61, "Brasília"),
        GO_62(62, "Goiânia"),
        GO_64(64, "Rio Verde"),
        MT_65(65, "Cuiabá"),
        MT_66(66, "Rondonópolis"),
        MS_67(67, "Campo Grande"),

        // Norte
        TO_63(63, "Palmas"),
        AC_68(68, "Rio Branco"),
        RO_69(69, "Porto Velho"),
        AM_92(92, "Manaus"),
        AM_97(97, "Coari"),
        RR_95(95, "Boa Vista"),
        PA_91(91, "Belém"),
        PA_93(93, "Santarém"),
        PA_94(94, "Marabá"),
        AP_96(96, "Macapá"),

        // Nordeste
        BA_71(71, "Salvador"),
        BA_73(73, "Ilhéus"),
        BA_74(74, "Juazeiro"),
        BA_75(75, "Feira de Santana"),
        BA_77(77, "Barreiras"),
        SE_79(79, "Aracaju"),
        PE_81(81, "Recife"),
        PE_87(87, "Petrolina"),
        AL_82(82, "Maceió"),
        PB_83(83, "João Pessoa"),
        RN_84(84, "Natal"),
        CE_85(85, "Fortaleza"),
        CE_88(88, "Juazeiro do Norte"),
        PI_86(86, "Teresina"),
        PI_89(89, "Picos"),
        MA_98(98, "São Luís"),
        MA_99(99, "Imperatriz");

        private final int codigo;
        private final String descricao;

        DddEnum(int codigo, String descricao) {
            this.codigo = codigo;
            this.descricao = descricao;
        }

    // Método útil para buscar o Enum pelo número
        public static DddEnum fromCodigo(int codigo) {
            for (DddEnum d : DddEnum.values()) {
                if (d.codigo == codigo) {
                    return d;
                }
            }
            throw new IllegalArgumentException("DDD inválido: " + codigo);
        }


}
