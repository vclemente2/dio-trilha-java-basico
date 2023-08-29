public class Cep {
    public static void main(String[] args) {
        try {

            validarCep("22.8750-180");
        } catch (Exception error) {
            System.out.println(error);
        }
    }

    public static void validarCep(String cep) throws CepInvalidoException {
        if (cep.replace(".", "").replace("-", "").length() != 8) {
            throw new CepInvalidoException();
        }

        System.out.println("Cep válido.");
    }
}
