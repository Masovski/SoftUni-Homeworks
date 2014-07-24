function variablesTypes(value) {
    var name = value[0];
    var age = value[1];
    var isMale = value[2];
    var favFoods = "";

    for (var i = 0; i < value[3].length; i++) {

        if (i < value[3].length - 1) {
            favFoods += value[3][i] + ",";
        }
        else {
            favFoods += value[3][i];
        }
    }

    console.log("My name: " + name + " //type is " + typeof(name));
    console.log("My age: " + age + " //type is " + typeof(age));
    console.log("I am male: " + isMale + " //type is " + typeof(isMale));
    console.log("My favorite foods are: " + favFoods + " //type is " + typeof(value[3]));
}

variablesTypes(['Pesho', 22, true, ['fries', 'banana', 'cake']]);