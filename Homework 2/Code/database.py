from shapes import *


# Another pseudo-database class that could handle retrieving
# data from a database if there were a database to retrieve data from
class Database:
    def __init__(self):
        print("Creating database object!")

    def get_objects(self):
        return [Circle(), Triangle(), Square(), Circle(), Square(), Triangle()]
