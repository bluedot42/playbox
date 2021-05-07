def comm_util(*args):
    if len(args) == 0:
        return 0
    for v in args:
        if not isinstance(v, int):
            return 0
