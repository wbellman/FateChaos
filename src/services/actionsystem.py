import logging

import dice

log = logging.getLogger("api")

def strong_roll( target: int ):
    r = dice.roll('1d6')
    val = r[0]
    if val <= target:
        return wrap_roll(r[0], True)
    else: 
        return wrap_roll(r[0], False)

def weak_roll(target: int):
    r = dice.roll('1d6')
    val = r[0]
    if val > target:
        return wrap_roll(r[0], True)
    else: 
        return wrap_roll(r[0], False)

def wrap_roll(roll: int,success: bool):
    return {
        "roll": roll,
        "success": success
    }

def poll_roll( target: int, primary: bool ):
   if primary:
       return strong_roll(target)
   else:
       return weak_roll(target)

