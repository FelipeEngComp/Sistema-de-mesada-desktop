
package Modelo;


public class ModeloInfracoes {
    private int id_infracao;
    private int quantidade_marcacao;
    private String data_infracao;
    private int id_pagamento;
    private float valor_pagamento;
    private String motivo;
    private String observacao;
    /**
     * @return the id_infracao
     */
    public int getId_infracao() {
        return id_infracao;
    }

    /**
     * @param id_infracao the id_infracao to set
     */
    public void setId_infracao(int id_infracao) {
        this.id_infracao = id_infracao;
    }

    /**
     * @return the quantidade_marcacao
     */
    public int getQuantidade_marcacao() {
        return quantidade_marcacao;
    }

    /**
     * @param quantidade_marcacao the quantidade_marcacao to set
     */
    public void setQuantidade_marcacao(int quantidade_marcacao) {
        this.quantidade_marcacao = quantidade_marcacao;
    }

    /**
     * @return the data_infracao
     */
    public String getData_infracao() {
        return data_infracao;
    }

    /**
     * @param data_infracao the data_infracao to set
     */
    public void setData_infracao(String data_infracao) {
        this.data_infracao = data_infracao;
    }

    /**
     * @return the id_pagamento
     */
    public int getId_pagamento() {
        return id_pagamento;
    }

    /**
     * @param id_pagamento the id_pagamento to set
     */
    public void setId_pagamento(int id_pagamento) {
        this.id_pagamento = id_pagamento;
    }

    /**
     * @return the valor_pagamento
     */
    public float getValor_pagamento() {
        return valor_pagamento;
    }

    /**
     * @param valor_pagamento the valor_pagamento to set
     */
    public void setValor_pagamento(float valor_pagamento) {
        this.valor_pagamento = valor_pagamento;
    }

    /**
     * @return the motivo
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * @param motivo the motivo to set
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * @return the observacao
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * @param observacao the observacao to set
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
           
}
