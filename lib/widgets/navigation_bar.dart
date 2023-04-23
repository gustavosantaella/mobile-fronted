import 'package:finance/config/constanst.dart';
import 'package:finance/providers/app_provider.dart';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

class NavigationBarWidget extends StatelessWidget {
  const NavigationBarWidget({super.key});

  @override
  Widget build(BuildContext context) {
    AppProvider appProvider = Provider.of(context);
    return NavigationBar(
      backgroundColor: appProvider.currentBackground,
      destinations: [
        IconButton(
            onPressed: () async {
              if (ModalRoute.of(context)?.settings.name == '/home') return;

              await Navigator.popAndPushNamed(context, '/home');
            },
            icon: const Icon(Icons.home, color: Colors.white)),
        IconButton(
            onPressed: () async {
              if (ModalRoute.of(context)?.settings.name == '/calendar') return;

              await Navigator.pushNamed(context, '/calendar');
            },
            icon: const Icon(
              Icons.calendar_month,
              color: Colors.white,
            )),
        // IconButton(
        // onPressed: () async {
        //   if (ModalRoute.of(context)?.settings.name == '/calendar') return;

        //   await Navigator.pushNamed(context, '/calendar');
        // },
        // icon: const Icon(
        //   Icons.graphic_eq,
        //   color: Colors.white,
        // )),
        IconButton(
            onPressed: () async {
              if (ModalRoute.of(context)?.settings.name == '/profile') return;

              await Navigator.pushNamed(context, '/profile');
            },
            icon: const Icon(
              Icons.person,
              color: Colors.white,
            ))
      ],
    );
  }
}