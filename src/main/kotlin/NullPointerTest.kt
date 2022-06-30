fun main() {
    var a = "asas"
//    a = null// Exception non save call

    var b: String? = "ASDASD"
    b = null;

    b?.length; //return length or null, without exception

    var l = b?.length ?: -1// Elvis operator if b == null return -1 else return length

    b = if ((0..10).random() > 5) "asdasd" else null
    var t = b!!.length;// null pointer if b == null

}