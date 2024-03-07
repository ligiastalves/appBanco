package core.model

data class User(var cpf: String = "", var name: String = "", var age: Int = 0, var sex: Char = 'x', var account: BankAccount?) {

}

data class BankAccount(var agencyId: Int, var accountId: Int, var balance: Int = 0, var password: String = "") {

}

