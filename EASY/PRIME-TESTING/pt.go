package main

import (
	"fmt"
	"math"
)

func isPrime(n int) bool {
	if n <= 1 {
		return false
	}
	for i := 2; i <= int(math.Sqrt(float64(n))); i++ {
		if n%i == 0 {
			return false
		}
	}
	return true
}

func main() {
	var n int
	fmt.Print("Enter a number: ")
	fmt.Scan(&n)
	if isPrime(n) {
		fmt.Println("YES")
	} else {
		fmt.Println("NO")
	}
}
