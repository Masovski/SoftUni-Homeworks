function isPrime(value) {
    var bPrime = true;
    if (value != 2) {
        for (var i = 2; i <= Math.sqrt(value) ; i++) {
            if (value % i == 0) {
                bPrime = false;
            }
        }
    }
    console.log(bPrime);
}

isPrime(7);
isPrime(254);
isPrime(587);