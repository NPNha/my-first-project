package com.example.myapplication

fun main(){
    //1. Non-null types – Kiểu dữ liệu không thể null
   // var numberOfBooks: Int = null
    var name:String = "Duong Vu"
    //  name = null
// Null cannot be a value of a non-null type String.
// Tức là giá trị null không thể được gán cho 1 biến có kiểu non-null type String
    var name2:String
  //  print("name = $name2")
 //variable ‘name’ must be initialized, tức là biến name phải được gán giá trị.

    // 2.  Nullable types – Kiểu dữ liệu có thể null()
    var name3:String?=null
    println("name = $name3")
    println("lời gọi an toàn")
    //3. Lời gọi an toàn
    var lengthOfName1 = name3?.length
    println("length = $lengthOfName1") // lengthofname1 = null
    var numberOfBooks = 6
    numberOfBooks = numberOfBooks?.dec()
    println("thong bao = $numberOfBooks")
    var name4:String = "Nam"
    var lengthOfName2 = name4?.length
    println("length = $lengthOfName2") //length = 3
    println("Nếu bạn chắc chắn biến name là khác null, có thể dùng !! để thay cho ?")

    println("Length = ${name4!!.length}")
    println("toan tu '?:' ")
    numberOfBooks = null ?: 0

    println(numberOfBooks)

}