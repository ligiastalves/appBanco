package core.cli

import core.model.BankAccount
import core.model.User

object Wizard {
    private const val INPUT_LABEL_CPF = "Me informe o CPF do usuário";
    private const val INPUT_LABEL_SEX = "Informe seu sexo: \n (M) para Masculino \n (F) para Feminino \n (X)não declarar";
    private const val AGENCY_ID = 100;

    fun newUserWizard(accountNumber: Int) : User{
        val newUser = User(account = null);
        newUser.cpf = inputHelper(INPUT_LABEL_CPF);
        newUser.name = inputHelper("Informe seu nome:");
        newUser.age = inputHelper("Informe sua idade:").toInt();
        newUser.sex = inputHelper(INPUT_LABEL_SEX).toCharArray()[0];
        newUser.account = BankAccount(agencyId = AGENCY_ID, accountId = accountNumber)
        //password
        newUser.account?.password = inputHelper("Defina uma nova senha ");
        return newUser;
    }

    private fun inputHelper(label: String):String{
        println(label);
        val input = readln();
        return input;
    }


}