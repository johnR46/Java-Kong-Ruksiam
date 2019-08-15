# เริ่มต้นกับ JAVA With Magic Oh. +haha
* เรียนตามคลิปเลย 
* Ref https://www.youtube.com/watch?v=gS7UqhKDk3E&list=PLEE74DyIkwEmNec5VsJmXqYghV8NCvChn
* อัปโค้ดเป็นตอนๆ มีทั้งหมด 13 + 1 ตอน 

  
part 1
 > evolution of program 
 *
    machine -> Assembly -> Procedural -> Object Oriented Functional 

* keyword oop  
  * Class 
  * Object 
  * Encapsulation
  * Inheritance
  * Polymorphism
* Access Modifier
  * public 
   -> ใครๆก็ได้
  * Protected 
   -> อยุ่ใน package         เดียวกันเข้าถึงได้        แปลกแฮะ 
  * Private 
   -> แค่ตัวเอง
* Encapsulation 
  * ซ่อนข้างในไว้ 

* สืบทอดคุณสมบัติ (Inheritance)
  * แม่ -> ลูก 
  * re-use 

* Keyword this & super 
  * this เมื่อต้องการเรียกใช้งานคอนสตรัคเตอร์อื่นๆ ที่อยู่ภายในคลาสเดียวกัน 
   * super เมื่อต้องการเรียกคอนสตรัคเตอร์ของคลาสแม่ให้ทำงาน
   * ในการเรียกใช้งานจะต้องทำการเรียกที่บรรทัดแรกสุดของคอนสตรัจเตอร์นั้นๆ เท่านั้น 
* พ้องรูป Polymorphm
 * เกิดจาก poly  (หลากหลาย ) + morphology (รูปแบบ)

* Overloarding & Overriding Method 
  * Overloarding Method ชื่อเหมือนกัน อยู่ภายในคลาสเดียวกัน แต่พารามิเตอร์ไม่เหมือนกัน ง่ายๆ คือรูปเดียวหลายพฤติกรรม Polymorphismw
  * Overriding Method เมธอดของคลาสลูกที่มีชื่อเหมือนกับเมธอดของคลาสแม่ เป็นผลมาจากการถ่ายทอดคุณสมบัติ inheritance 

  ------------- part 2 -----------
  * Clas & Object 
    * Class ต้นแบบ 
    * Object สิ่งที่ถูกสร้างขึ้นจากคลาส และ ฟิลด์
    

     --------- Example -------
     public class Employee{
         private  String    id;
         private  String    name;
         private  double    salary;


         modifier dataType    Name
     }
     
     --------- Example -------

-------- part 3 ------

* Method เป็นตัวกำหนดพฤติกรรมของคลาส 



------------part 5 --------

* Constructor 
 * มีชื่อเหมือนกับคลาส เมื่อมีการสร้างวัตถุขึ้น จะถูกเรียกใช้งานเลยทันที ใช้กำหนดค่าเริ่มต้นให้กับตัวแปรคลาสของวัตถุ
 * keyword 
  * ชื่อเหมือนคลาส
  * method คืนนค่ากลับ แต่ Constructor ไม่มีการคืนค่ากลับ
  * ประกาศการเข้าถึงแบบ public 

----------------
public Employee () {
   ownerName = "unassunged";
}
--------------



------------- part 6 ---------

* Acess modifier 
* publice 
   * all acess
* private
   * only class เดียวกัน 
* protected
   * package เดียวกัน 
   * ต่างแพ็คเก็ต แต่เป็นคลาสแม่ลูกกัน 

* ส่วนที่ทำให้ติดพิษ 55555
* static keyword : 
   * Non-access modifier : Static 
   * ใช้กำหนดหน้า method เป็น static เรียกว่า static method  ทำให้สามารถเรียกใช้งานเมธอดได้โดยที่ไม่ต้องสร้างออปเจ็ค
   * เช่นเดียวกับข้อมูล static attribute ใช้ข้อมูลได้โดยที่ไม่ต้องสร้างคลาส 


   ---------------------- part 6 ----------------
* Inheritance
   * นิยามคลาสใหม่จากรูปแบบของคลาสที่มีอยู่แล้ว โดยจะนำของเก่ามาใช้
   * มีผลทำให้เกิด Overriding method 

---------------part 8 --------
* super()
   * ไว้ใช้ให้คลาสลูกส่งผ่าน ค่าไปเรียกใช้ของของแม่
   *  Programmer p1 = new Programmer("john",40003.3);
   * public Programmer(String name,double Salary){
     super(name,Salary);
     System.out.println("I am programmer ");
  
}  
