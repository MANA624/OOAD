from abc import ABC, abstractmethod


# The shape superclass, inheriting from the
# Abstract Base Class (abc)
class Shape(ABC):
    shape_string = ""

    def __init__(self, shape_name, num_sides):
        self.shape_name = shape_name
        self.num_sides = num_sides
        print("You made a {} object!".format(self.shape_name))

    # Relies in part on an implementation by the subclass
    @abstractmethod
    def print_shape(self):
        print(self.shape_string)

    def get_sides(self):
        return self.num_sides


class Triangle(Shape):
    def __init__(self):
        super().__init__("triangle", 3)
        self.shape_string = "" + \
            "            ^           \n" + \
            "           / \\         \n" + \
            "          /   \\        \n" + \
            "         /     \\       \n" + \
            "        /       \\      \n" + \
            "       /         \\     \n" + \
            "      /           \\    \n" + \
            "     /             \\   \n" + \
            "    /               \\  \n" + \
            "   /                 \\ \n" + \
            "  /                   \\\n" + \
            "  ---------------------"

    def print_shape(self):
        print("Triangles are the coolest!")
        super().print_shape()


class Square(Shape):
    def __init__(self):
        super().__init__("square", 4)
        self.shape_string = "" + \
            " _____________________   \n" + \
            " |                    |  \n" + \
            " |                    |  \n" + \
            " |                    |  \n" + \
            " |                    |  \n" + \
            " |                    |  \n" + \
            " |                    |  \n" + \
            " |                    |  \n" + \
            " |                    |  \n" + \
            " |                    |  \n" + \
            " |                    |  \n" + \
            " |                    |  \n" + \
            "  --------------------     "

    def print_shape(self):
        print("You're just a square!")
        super().print_shape()


class Circle(Shape):
    def __init__(self):
        super().__init__("circle", 99999999)
        self.shape_string = "" + \
            "        . -- ~~~ -- .\n" + \
            "    .-~               ~-.\n" + \
            "   /                     \\\n" + \
            "  /                       \\\n" + \
            " |                         |\n" + \
            " |                         |\n" + \
            " |                         |\n" + \
            "  \\                       /\n" + \
            "   \\                     /\n" + \
            "    `-.               .-'\n" + \
            "        ~- . ___ . -~\n"

    def print_shape(self):
        print("Circle the right answer!!!")
        super().print_shape()
