import 'package:sqflite/sqflite.dart';
import 'package:path/path.dart';

class DB {
  Future<Database> openDB() async {
    try {
      var databasesPath = await getDatabasesPath();
      String path = join(databasesPath, 'data.db');
      Database db =
          await openDatabase(path, version: 1, onCreate: createTables);

      return db;
    } catch (e) {
      throw "Error to open database";
    }
  }

  createTables(Database db, int version) async {
    await db.transaction((txn) async {
        await txn.execute('CREATE TABLE IF NOT EXISTS user(token TEXT)');
    });
  }
}