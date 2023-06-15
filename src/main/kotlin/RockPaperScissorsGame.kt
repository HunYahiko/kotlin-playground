import java.lang.Math.random

fun main() {
    val choices = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(choices)
    val userChoice = getUserChoice(choices)
    printResult(userChoice, gameChoice)
}

fun getGameChoice(existingChoices: Array<String>) = existingChoices[(random() * existingChoices.size).toInt()]

fun getUserChoice(existingChoices: Array<String>): String {
    var userChoice = ""
    var isChoiceValid = false
    while (!isChoiceValid) {
        print("Please one of the following:")
        for (choice in existingChoices) print(" $choice")
        println(".")
        val userInput = readlnOrNull()
        if (userInput != null && userInput in existingChoices) {
            isChoiceValid = true
            userChoice = userInput
        } else println("You must enter a valid choice!")
    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice: String) {
    val result: String =
        if (userChoice == gameChoice) "Tie!"
        else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
            (userChoice == "Paper" && gameChoice == "Rock") ||
            (userChoice == "Scissors" && gameChoice == "Paper")
        ) "You win!"
        else "You lose!"
    //Print the result
    println("You chose $userChoice. I chose $gameChoice. $result")
}