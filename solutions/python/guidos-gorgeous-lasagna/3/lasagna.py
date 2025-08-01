"""Functions used in preparing Guido's gorgeous lasagna.

Learn about Guido, the creator of the Python language: https://en.wikipedia.org/wiki/Guido_van_Rossum
"""

# define the 'EXPECTED_BAKE_TIME' constant
# consider defining the 'PREPARATION_TIME' constant
# equal to the time it takes to prepare a single layer
EXPECTED_BAKE_TIME = 40

# define the 'bake_time_remaining()' function
def bake_time_remaining(elapsed_bake_time):
    """Calculate the bake time remaining.
    :param elapsed_bake_time: int - baking time already elapsed.
    :return: int - remaining bake time (in minutes) derived from                         'EXPECTED_BAKE_TIME'.
    Function that takes the actual minutes the lasagna has been in the oven as
    an argument and returns how many minutes the lasagna still needs to bake
    based on the `EXPECTED_BAKE_TIME`.
    """

    return EXPECTED_BAKE_TIME - elapsed_bake_time


# define the 'preparation_time_in_minutes()' function
# and consider using 'PREPARATION_TIME' here
def preparation_time_in_minutes(number_of_layers):
    
    """
    Return preparation time of lassagna pasta layers.
    Assume two minutes for each layer.

    ;number_of_layers: int - number of lassagna pasta layers
    return: int - total preparation amount of time
    
    This function takes a number representing the number of
    lassagna pasta layers and returns the total time it takes
    to prepare them for the lassagna.
    """
    
    return number_of_layers * 2


# define the 'elapsed_time_in_minutes()' function
def elapsed_time_in_minutes(number_of_layers=3, elapsed_bake_time=5):

    """
    Return elapsed cooking time.

    ;number_of_layers: int - number of lassagna pasta layers
    ;elapsed_bake_time: int - cooking time already consumed
    return: int - total preparation + cooking elapsed time
    This function takes two numbers representing the number of layers
    & the time already spent baking and calculates the total elapsed
    minutes spnt cooking the lasagna.
    """
    
    return preparation_time_in_minutes(number_of_layers) + elapsed_bake_time
    