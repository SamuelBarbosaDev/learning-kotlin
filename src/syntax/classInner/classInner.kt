fun main(args: Array<String>){
    val warrior = Warrior("Rei Maligno")

    warrior
        .showWarriorData()
    warrior
        .Skill("Soco")
        .showSkillData()
}

class Warrior(val name: String){
    fun showWarriorData() = println("The warrior's name is: $name")

    inner class Skill(val skillName: String){
        fun showSkillData() = println("$name: The name of the Skill is: $skillName")}
}