package exercicios.desafioProjeto;

import exercicios.desafioProjeto.singleton.SingletonEager;
import exercicios.desafioProjeto.singleton.SingletonLazy;
import exercicios.desafioProjeto.singleton.SingletonLazyHolder;
import exercicios.desafioProjeto.strategy.*;

public class Teste {
    static void main() {
        // Testes relacionados ao Design Patters Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        //Testes relacionados ao Design Patters Strategy
        Comportamento nornal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(nornal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
    }
}
