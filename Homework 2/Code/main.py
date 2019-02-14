from database import *


# Our main routine with minimal access to objects
def main():
    database = Database()
    objects = database.get_objects()
    objects.sort(key=lambda x: x.num_sides)
    for obj in objects:
        obj.print_shape()


if __name__ in "__main__":
    main()
