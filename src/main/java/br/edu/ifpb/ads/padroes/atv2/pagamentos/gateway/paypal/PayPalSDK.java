public class PayPalSDK {
    public void sendPayment(String email, double amount) {
        System.out.println("[PayPal SDK API] Pagamento enviado com sucesso!");
        System.out.println("                 Destinatário: " + email);
        System.out.println("                 Valor: USD " + amount);
    }
}