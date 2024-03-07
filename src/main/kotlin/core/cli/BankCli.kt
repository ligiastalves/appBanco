package core.cli

import core.model.User

class BankCli {

    private var _isShowMenu = false;
    private var _accountList = mutableListOf<User>();

    private fun printMainMenu() {
        println("Número de contas ativas...................${this._accountList.size}");
        println("NOVA CONTA................................01");
        println("ENCERRAR CONTA............................02");
        println("ENTRAR....................................03");
        println("SAIR......................................04");
        clean(2);

    }

    private fun handleWithMainMenuOptions(option: Int) {
        when (option) {
            1 -> {
                val user = Wizard.newUserWizard(this._accountList.size.plus(1));
                this._accountList.add(user); //add new account to the list
                println("Novo usuário = ${user.cpf}");
            }

            2 -> {

            }

            3 -> {

            }

            4 -> {

            }
        }
    }

    fun clean(lines: Int = 100) {
        for (i in 0..lines) {
            println();
        }
    }

    fun showMenu() {
        this._isShowMenu = true;

        while (_isShowMenu) {
            printMainMenu();
            val input = readln();
            println("O usuario digitou o numero: $input");
            handleWithMainMenuOptions(input.toInt());
        }
    }
}
