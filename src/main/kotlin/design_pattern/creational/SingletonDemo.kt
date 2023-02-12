package design_pattern.creational
/**
 * The Singleton pattern is a design pattern that restricts a class to have only one instance,
 * while providing a global point of access to this instance.
 *
 * This class implements the Singleton pattern by using an object declaration and a private constructor.
 *
 */
object SingletonDemo {
    init {
        println("Initializing : $this")
    }

    fun log() : SingletonDemo = apply { println("Singleton class : $this") }
}