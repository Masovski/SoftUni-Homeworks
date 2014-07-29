function findYoungestPerson(persons) {
    var youngest = {name: '', age: Infinity};

    for (var i = 0; i < persons.length; i++) {
        if (persons[i]['age'] < youngest['age']) {
            youngest['name'] = persons[i]['firstname'] + " " + persons[i]['lastname'];
            youngest['age'] = persons[i]['age'];
        }
    }

    console.log("The youngest person is " + youngest['name']);
}

var persons = [
  { firstname: 'George', lastname: 'Kolev', age: 32 },
  { firstname: 'Bay', lastname: 'Ivan', age: 81 },
  { firstname: 'Baba', lastname: 'Ginka', age: 40 }];
findYoungestPerson(persons);