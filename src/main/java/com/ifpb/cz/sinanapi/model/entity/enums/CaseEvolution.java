package com.ifpb.cz.sinanapi.model.entity.enums;

public enum CaseEvolution {
        CURA(1),
        OBITO_AGRAVO(2),
        OBITO_OUTRAS_CAUSAS(3),
        IGNORADO(9);

        private final int codigo;

        CaseEvolution(int codigo) {
            this.codigo = codigo;
        }

        public int getCodigo() {
            return codigo;
        }

    }
