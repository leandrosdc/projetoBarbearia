
fun main(){
    var init:Int = 4
    var codigoCliente:Int = 0
    while(init != 0){
        println("BEM VINDO A BARBEARIA")
        println("0 - Sair")
        println("1 - Agendar Corte")
        println("2 - Cadastrar Cliente")
        println("3 - Cadastrar Barbeiro")
        print("Informe sua opção:")

        init = Integer.valueOf(readLine())
        println("")
        if(init < 0 || init >= 4){
            print("Informe uma opção entre 0 e 3:")
            init = 4
        }

        when{
            init == 0 -> println("Opcão 0, encerrando programa")
            init == 1 -> {
                println("Agendar Corte")
            }
            init == 2 -> {
                println("Cadastrar Cliente")
            }
            init == 3 ->{
                println("Cadastrar Barbeiro")
                print("Digite o nome:")
                var nomeCliente = readLine()!!
                println("")
                print("Digite o Telefone:")
                var telefoneCliente = readLine()!!
                println("")
                var cliente1 = Cliente(codigoCliente,nomeCliente,telefoneCliente)
                codigoCliente++
            }
        }
    }
}