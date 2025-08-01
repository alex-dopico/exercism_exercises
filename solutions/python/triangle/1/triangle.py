def is_it_triangle(sides):
    is_triangle = False

    if (sides[0] + sides[1] > sides[2]) and (sides[0] + sides[2] > sides[1]) and (sides[1] + sides[2] > sides[0]):
        is_triangle = True
    else:
        pass

    return is_triangle


def equilateral(sides):
    is_equilateral = False
    is_triangle = is_it_triangle(sides)
    
    if is_triangle:
        if (sides[0] == sides[1] == sides[2]):
            is_equilateral = True
        else:
            pass
    else:
        pass
        
    return is_equilateral


def scalene(sides):
    is_scalene = False
    is_triangle = is_it_triangle(sides)
    
    if is_triangle:
        if (sides[0] != sides[1]) and (sides[0] != sides[2]) and (sides[1] != sides[2]):
            is_scalene = True
        else:
            pass
    else:
        pass

    return is_scalene

    
def isosceles(sides):
    is_isosceles = False
    is_triangle = is_it_triangle(sides)

    if is_triangle:
        if (sides[0] == sides[1]) or (sides[0] == sides[2]) or (sides[1] == sides[2]):
            is_isosceles = True
    else:
        pass

    return is_isosceles
