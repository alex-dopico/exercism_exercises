def square(number):

    if 1 <= number <= 64:
        return 2**(number - 1)
    else:
        raise ValueError("square must be between 1 and 64")

    

def total():

    result = 0

    for number in range(64):
        result = result + 2**(number)

    return result