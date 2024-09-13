package com.valdir.heldesk.enums;

public enum Status {

    ABERTO(0, "ROLE_ABERTO"), ANDAMENTO(1, "ROLE_ANDAMENTO"), ENCERRADO(2, "ROLE_ENCERRADO");

        private Integer codigo;
        private Integer descricao;
    private Status(Integer aberto, Integer andamento, Integer encerramento) {
       this.codigo = codigo;
       this.descricao = descricao;
    }
    private Status(Integer codigo, String string) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public Integer getDescricao() {
        return descricao;
    }
    
    public static Status toEnum(Integer cod){
        if(cod == null){
            return null;
        }
        for(Status x : Status.values()){
            if (cod.equals(x.getCodigo())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Status inválido!");
    }
    
}
