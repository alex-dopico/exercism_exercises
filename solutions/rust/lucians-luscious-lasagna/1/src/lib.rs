// This stub file contains items that aren't used yet; feel free to remove this module attribute
// to enable stricter warnings.
#![allow(unused)]

pub fn expected_minutes_in_oven() -> i32 {
    let expected_minutes_in_oven: i32 = 40;
    expected_minutes_in_oven
}

pub fn remaining_minutes_in_oven(actual_minutes_in_oven: i32) -> i32 {
    let remaining_minutes_in_oven = expected_minutes_in_oven() - actual_minutes_in_oven;
    remaining_minutes_in_oven
}

pub fn preparation_time_in_minutes(number_of_layers: i32) -> i32 {
    let preparation_time = number_of_layers * 2;
    preparation_time
}

pub fn elapsed_time_in_minutes(number_of_layers: i32, actual_minutes_in_oven: i32) -> i32 {
    let elapsed_time = preparation_time_in_minutes(number_of_layers) + actual_minutes_in_oven;
    elapsed_time
}
