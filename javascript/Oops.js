class Person{
    constructor(city){
        this.city = city;
    }
    getID(){
        console.log("ID is 2723218");
    }
    getCourse(){
        console.log("Course is --------->  JFS");
    }
}

class Student extends Person{
    constructor(name,age,city){
        super(city);
        this.name = name;
        this.age = age;
    }
    display(){
        console.log(`Name of the Person is ${this.name} , age falls under ${this.age} and residency is at ${this.city}`);
    }
    getID(){
        console.log("Course is ---------> PFS");
    }

}
const s = new Student("Pooji",23,"Palamaner");
s.display();
s.getID();
s.getCourse();

