# เริ่มต้นกับ JAVA With Magic Oh. +haha
* เรียนตามคลิปเลย 
* Ref https://www.youtube.com/watch?v=gS7UqhKDk3E&list=PLEE74DyIkwEmNec5VsJmXqYghV8NCvChn
* อัปโค้ดเป็นตอนๆ มีทั้งหมด 13 + 1 ตอน 
* https://howtodoinjava.com/java-8-tutorial/
* อีกอัน น่าสนใจเหมือนกัน เริ่มแป้ป 


  
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

--------------------------- part 9 ---------------------------
* modifier : final 
   * สามารถกำหนด keyword นี้่ให้กับ class,method,attribute 
   * final ให้ class คลาสนั้นจะไม่สามารถมี  subclass ได้ 
   * final ให้ method methodนั้นจะไม่สามารถ override method  ได้ 
   * final ให้ data หรือ attribute  data นั้นจะเป็น constant   (ค่าคงที่ ) 
   



--------------------------- part 10 ---------------------------
* Polymorphism
   * คุณสมบัติการพ้องรูป คือ คุณสมบัติที่สามารถตอบสนองต่อ 
   Method เดียวกันด้วยวิธีการที่ต่างกันและสามารถกำหนด object ได้หลายรูปแบบ 
   * ข้อดี คือโปรแกรมสามารถปรับเปลี่ยนหรือเพิ่มเติมได้ง่ายขึ้น 
   
* overloard Method ชื่อเหมือนกัน แต่ parm ต่างกัน 
* overriding Method เป็นการกำหนดการทำงานให้กับ method ที่สืบทอดคุณสมบัติมาจากคลาสแม่ (Inheritance)



------------------------------- part 11 ------------------------------
* Abstract Keyword 
   * abstract Method 
      *   คือ method  ว่างๆ ที่ยังไม่ได้กำหนด รายละเอียดการทำงานลงไป 
      * ปกติจะถูกกำหนดตอนที่คลาสลูกได้รับการสืบทอดจาก Class ของ abstract method เหล่านั้น 

* กฏ หาก class ใดก็แล้วแต่ที่ประกอบไปด้วย abstracrt method อย่างน้อง 1 method class นั้นต้องเป็น abstract ด้วย 

* ดีไซน์ไว้ก่อน  กำหนดค่าทีหลัง (ในคลาสลูก) ปนกับ Method ปกติธรรมดาได้ 



-------------------------------- part 12 ----------------
* Interface
   * มีหลักการคล้ายๆ กับ Abstract 
      * สร้าง interface ขึั้นมาเพื่อกำหนดโครงสร้างของโปรแกรมที่จะใช้งาน แต่ยังไม่มีการกำหนดหน้าที่การทำงานให้มัน เรียกสั้นๆ ว่า Abstract Method  
      * Method ใน interface จึงเป็น Method มี่ว่างเปล่า ซึ่งภายหลังจึงมีการกำหนดรายละเอียดของ method 
      โดยถูกกำหนดโดยคลาสที่เรียกใช้ interface นั้น ๆ 
      
* ข้อแตกต่างระหว่าง interface กับ Abstract Class
   * ตอนนิยามค่า
      * Method ใน Abstract Class ไม่เป็น Abstract Method ทุกอัน ก็ได้
      * ทุก Method ใน interface เป็น Abstract method
   * ตอนเรียกใช้
      * Class ที่จะเรียกใช้ Abstract Method ใน Abstract class จะต้องสืบทอดคุณสมบัติไป (คลาสลูกอะ) แล้วทำการ overriding (ตั้งชื่อ method ของตัวเองให้ เหมือนตัวแม่) จากนั้นกำหนดค่าข้างในตามต้องการ
      * Class ที่จะเรียกใช้ Method ใน interface ไม่จำเป็นต้องมี ความสำพันธ์ไดๆ กับ interface ทั้งสิ้น
* การใช้งาน interface 
   * คลาสที่ทำการ implements interface ใดๆ จะต้องเขียน methodที่มีอยู่ใน interface นั้นมาให้ครบทุกmethod ไม่ว่าจะต้องกำนดรายระเอียดข้างใน method หรือไม่ก็ตาม จะต้องมีการเขียน method เหล่านั้นให้ครบ ไม่เช่นนั้นจะเกิดข้อผิดผลาดตอนคอมไพล์ program 

* คนที่คิดมา ถถถถ  ทำให้ง่ายต่อการ Design เนี่ยนะ ถถถถถถถ เปลืองหัวดีเเท้ 
   * สรุป
   



