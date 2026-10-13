package questao01.enums;

public enum StatusProduto {
    ATIVO("ativo"),
    INATIVO("inativo"),
    SEM_ESTOQUE("sem estoque"),
    DESCONTINUADO("descontinuado");

    private final String status;

    StatusProduto(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public static StatusProduto stringParaStatus(String status) {
        for (StatusProduto statusProduto : StatusProduto.values()) {
            if (statusProduto.getStatus().equalsIgnoreCase(status)) {
                return statusProduto;
            }
        }

        throw new IllegalArgumentException("Status inválido: " + status);
    }
}