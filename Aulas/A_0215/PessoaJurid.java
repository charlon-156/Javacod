package Aulas.A_0215;

public class PessoaJurid extends Cliente{
    String razãoSocial;
    String nomeFantasia;
    String siglaNome;
    String CNPJ;

    public String getRazãOSocial() {
        return this.razãoSocial;
    }

    public void setRazãOSocial(String razãoSocial) {
        this.razãoSocial = razãoSocial;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getSiglaNome() {
        return this.siglaNome;
    }

    public void setSiglaNome(String siglaNome) {
        this.siglaNome = siglaNome;
    }

    public String getCNPJ() {
        return this.CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

}
