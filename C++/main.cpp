#include <iostream>
using namespace std;

int main() {

    cout << "Hello, World!" << endl;

    int x = 5;  // 4 bytes
    float y = 3.14;  // 4 bytes
    string name = "Hello";  // 24 bytes (may vary)
    bool isTrue = true;  // 1 byte
    double z = 2.71828;  // 8 bytes

    cout << x << endl;
    cout << y << endl;
    cout << name << endl;
    cout << isTrue << endl;
    cout << z << endl;


    // Calculate area of circle
    float r = 5.0;
    float PI = 3.14;
    float area = PI * r * r;
    cout << "Area of circle: " << area << endl;

    // Calculate Simple Interest
    float principal = 1000.0;
    float rate = 5.0;
    float time = 2.0;
    float simpleInterest = (principal * rate * time) / 100;
    cout << "Simple Interest: " << simpleInterest << endl;

    // Take name input
    string userName;
    cout << "Enter your name: ";
    cin >> userName;
    cout << "Hello, " << userName << "!" << endl;


    // typecasting
    float a = 5.5;
    int b = (int)a;  // explicit typecasting
    cout << "Float value: " << a << endl;
    cout << "Integer value: " << b << endl;

    return 0;
}
