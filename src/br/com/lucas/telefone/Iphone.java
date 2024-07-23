package br.com.lucas.telefone;

import br.com.lucas.telefone.internet.Navegador;
import br.com.lucas.telefone.ligacao.AparelhoTelefonico;
import br.com.lucas.telefone.musica.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, Navegador {


    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina" + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo o celular");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica " + musica);
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        //telefone
        iphone.atender();
        iphone.ligar("982424877");
        iphone.iniciarCorreioDeVoz();

        //reprodutor Musicaiphona
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("ceu azul");

        //internet
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina("www.google.com");

    }
}

