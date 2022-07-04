import java.util.DoubleSummaryStatistics
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
//for (item in Vector.generateVectors(12)){
//    println(item)
//}
    var one = Vector.generateVectors(1)[0]
    var two = Vector.generateVectors(1)[0]

    println(one + two)
}


data class Vector(var x: Double, var y: Double, var z: Double) {

    fun vectorLength(): Double {
        return sqrt(x.pow(2) + y.pow(2) + z.pow(2))
    }

    fun scalar(vector: Vector): Double {
        return x * vector.x + y * vector.y + z * vector.z
    }

    fun crossProduct(vector: Vector): Vector {
        var newX = y * vector.z - z * vector.y
        var newY = z * vector.x - x * vector.z
        var newZ = x * vector.y - y * vector.x

        return Vector(newX, newY, newZ)
    }

    fun cosAngle(vector: Vector): Double {
        return scalar(vector) / abs(vectorLength()) * abs(vector.vectorLength())
    }

    companion object {
        fun generateVectors(count: Int): MutableList<Vector> {
            var res: MutableList<Vector> = mutableListOf()
            repeat(count) { res.add(Vector(Math.random(), Math.random(), Math.random())) }

            return res
        }

        fun length(vector: Vector): Double {
            return sqrt(vector.x.pow(2) + vector.y.pow(2) + vector.z.pow(2))
        }
    }

    override fun toString(): String {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }


    operator fun plus(other: Vector): Vector {
        return Vector(x + other.x, y + other.y, z + other.z)
    }

    operator fun minus(other: Vector): Vector {
        return Vector(x - other.x, y - other.y, z - other.z)
    }

    // owerloading operator "*" to crossProduct
    operator fun times(other: Vector): Vector {
        var newX = y * other.z - z * other.y
        var newY = z * other.x - x * other.z
        var newZ = x * other.y - y * other.x

        return Vector(newX, newY, newZ)
    }
}