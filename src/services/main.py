# Core modules
import logging  

# Package modules
from fastapi import FastAPI
from pydantic import BaseModel

# Custom modules
from actionsystem import poll_roll

app = FastAPI()

log = logging.getLogger("api")

class Outcome(BaseModel):
    roll: int
    success: bool

@app.get("/")
def read_root():
    return {
        "api": "FateChaos",
        "version": '1.20191115.1'
    }

@app.get("/poll_roll/{target}")
def do_poll_roll(target: int, primary: bool = True):
    o = poll_roll(target, primary)
    return Outcome(**o)
