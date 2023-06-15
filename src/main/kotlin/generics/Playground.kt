package generics

fun main() {
    val catVet = Vet<Cat>()
    val catContest =  Contest(catVet)

    catContest.addScore(Cat("Leo"), 56)
    catContest.addScore(Cat("Filea"), 57)
    catContest.addScore(Cat("Some bitch"), 5)

    println("The cat contest winners are ${catContest.getWinners()}")

    val catFuzz = Cat("Fuzz Lightyear")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny McGraw")
    val fishVet = Vet<Fish>()
    val petVet = Vet<Pet>()
    catVet.treat(catFuzz)
    petVet.treat(catKatsu)
    petVet.treat(fishFinny)
    val secondCatContest = Contest(catVet)
    secondCatContest.addScore(catFuzz, 50)
    secondCatContest.addScore(catKatsu, 45)
    val topCat = secondCatContest.getWinners().first()
    println("Cat contest winner is ${topCat.name}")
    val petContest = Contest(petVet)
    petContest.addScore(catFuzz, 50)
    petContest.addScore(fishFinny, 56)
    val topPet = petContest.getWinners().first()
    println("Pet contest winner is ${topPet.name}")

    val fishContest = Contest<Fish>(petVet)

    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()
    val petRetailer: Retailer<Pet> = CatRetailer()
    petRetailer.sell()
}