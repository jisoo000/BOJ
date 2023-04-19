import sys

def is_prime(n):
    if n == 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

def find_divisor(p, k):
    for i in range(2, k):
        if is_prime(i) and p % i == 0:
            return i
    return None

def main():
    p, k = map(int, sys.stdin.readline().split())
    divisor = find_divisor(p, k)
    if divisor is None:
        print("GOOD")
    else:
        print("BAD", divisor)

if __name__ == "__main__":
    main()
