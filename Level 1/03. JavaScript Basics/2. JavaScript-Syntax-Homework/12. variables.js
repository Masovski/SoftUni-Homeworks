function variablesTypes(value) {
    var name = value[0];
    var age = value[1];
    var isMale = value[2];
    var favFoods = value[3].join();

    console.log("My name: " + name + " //type is " + typeof(name));
    console.log("My age: " + age + " //type is " + typeof(age));
    console.log("I am male: " + isMale + " //type is " + typeof(isMale));
    console.log("My favorite foods are: " + favFoods + " //type is " + typeof(value[3]));
}

variablesTypes(['Pesho', 22, true, ['fries', 'banana', 'cake']]);