package br.edu.univas.main;

public class ArvorePizza {
    public static void main(String[] args) throws Exception {
        
        Arvore arvore = new Arvore("Pizzas");

        No calabresa = new No ("Calabresa", 1000f, 1);
        No mussarela = new No ("Mussarela", 2000f, 1);
        No frango = new No ("Frango", 200f, 4);
        No portuguesa = new No ("Portuguesa", 400f, 1);
        No lombo = new No ("Lombo", 200f, 2);
        No marguerita = new No("Marguerita", 400f, 1);
        No brigadeiro = new No("Brigadeiro", 500f, 1);


        arvore.getRaiz().acrescentarFilho(calabresa);
        arvore.getRaiz().acrescentarFilho(mussarela);
        arvore.getRaiz().acrescentarFilho(frango);
        arvore.getRaiz().acrescentarFilho(portuguesa);
        arvore.getRaiz().acrescentarFilho(lombo);

        
        No massa = new No ("Massa", 10f, 10);
        No calabreza = new No ("Linguiça Calabresa", 10f, 10);
        No queijo = new No ("Queijo", 20f, 4);
        No cebola = new No ("Cebola", 20f, 1);
        No oregano = new No ("Oregano", 200f, 1);
        No peitodefrango = new No("Peito de Frango", 1000f, 1);
        No catupiry = new No("Cautpiry", 8f, 100);
        No milho = new No("Milho", 200f, 1);
        No presunto = new No("Presunto", 800f, 1);
        No ovo = new No("Ovo", 150f, 1);
        No azeitona = new No("Azeitona",50f,1);
        No lombocanadense = new No("Lombo Canadense", 200f, 1);
        No ervilha = new No("Ervilha", 100f, 1);
        No molho = new No("Molho", 25f, 4);
        No tomate = new No("Tomate", 100f, 1);


        calabresa.acrescentarFilho(massa);
        calabresa.acrescentarFilho(calabreza);
        calabresa.acrescentarFilho(queijo);
        calabresa.acrescentarFilho(cebola);
        calabresa.acrescentarFilho(molho);
        calabresa.acrescentarFilho(oregano);
        

        mussarela.acrescentarFilho(massa);
        mussarela.acrescentarFilho(molho);
        mussarela.acrescentarFilho(queijo);
        mussarela.acrescentarFilho(oregano);

        frango.acrescentarFilho(massa);
        frango.acrescentarFilho(molho);
        frango.acrescentarFilho(peitodefrango);
        frango.acrescentarFilho(catupiry);
        frango.acrescentarFilho(milho);
        frango.acrescentarFilho(queijo);
        frango.acrescentarFilho(oregano);

        portuguesa.acrescentarFilho(massa);
        portuguesa.acrescentarFilho(presunto);
        portuguesa.acrescentarFilho(molho);
        portuguesa.acrescentarFilho(queijo);
        portuguesa.acrescentarFilho(oregano);
        portuguesa.acrescentarFilho(cebola);
        portuguesa.acrescentarFilho(ovo);
        portuguesa.acrescentarFilho(azeitona);
        portuguesa.acrescentarFilho(tomate);
        portuguesa.acrescentarFilho(ervilha);
    
        lombo.acrescentarFilho(massa);
        lombo.acrescentarFilho(lombocanadense);
        lombo.acrescentarFilho(queijo);
        lombo.acrescentarFilho(catupiry);
        lombo.acrescentarFilho(ervilha);
        lombo.acrescentarFilho(molho);
        lombo.acrescentarFilho(oregano);
        

        //CUSTO TOTAL DO PRODUTO
        arvore.getRaiz().valorArvore();
        System.out.println("\n \n VALOR TOTAL: "+No.soma);


        arvore.getRaiz().folhas();
        System.out.println("\n \n \n \n \n \n INGREDIENTES \n");
        for(No folha : No.folhas){
            System.out.println("Nome: "+folha.getNome());
            System.out.println("Valor: "+folha.getValor());
            System.out.println("Quantidade: "+folha.getQuantidade());
        }

        arvore.getRaiz().componentes();
        System.out.println("\n \n \n \n \n \n PIZZAS POR SABOR \n");
        for(No folha : No.componentes){
            System.out.println("Nome: "+folha.getNome());
            System.out.println("Valor: "+folha.getValor());
            System.out.println("Quantidade: "+folha.getQuantidade());
        }


        //BUSCA
        No buscado = arvore.getRaiz().buscar("Queijo");
        if(buscado != null){
            System.out.println("Ingrediente: " +buscado.getNome()+ "Valor: "+buscado.getValor()+ "Quantidade: "+ buscado.getQuantidade());
        }else {
            System.out.println("Não Encontrado");
        }

        buscado = arvore.getRaiz().buscar("Molho");
        if(buscado != null){
            System.out.println("Ingrediente: " +buscado.getNome()+ "Valor: "+buscado.getValor()+ "Quantidade: "+ buscado.getQuantidade());
        }else {
            System.out.println("Não Encontrado");
        }

        buscado = arvore.getRaiz().buscar("Massa");
        if(buscado != null){
            System.out.println("Ingrediente: " +buscado.getNome()+ "Valor: "+buscado.getValor()+ "Quantidade: "+ buscado.getQuantidade());
        }else {
            System.out.println("Não Encontrado");
        }


    }
}
