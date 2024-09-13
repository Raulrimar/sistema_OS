package com.valdir.heldesk.enums;

public enum Perfil {

    ADMIN(0, "ROLE_ADMIN"), CLIENTE(1, "ROLE_CLIENTE"), TECNICO(2, "ROLE_TECNICO");

    //criando atributo para corrigir o erro acima
    private Integer codigo;
    private String descricao;

    //deve ser gerado o contrutor
    private Perfil(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //criação de metodo
    public static Perfil toEnum(Integer cod){
      if (cod == null){
        return null;
      }
      for(Perfil x : Perfil.values()){//para cada perfil x dentro(:) do perfil values
        if(cod.equals(x.getCodigo())){//validar
            return x;
        }
      }
    throw new IllegalArgumentException("Perfil inválido");
    }
}
