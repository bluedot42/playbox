size = {1000: ['KB', 'MB', 'GB', 'TB', 'PB', 'EB', 'ZB', 'YB'],1024: ['KiB', 'MiB', 'GiB', 'TiB', 'PiB', 'EiB', 'ZiB', 'YiB']}


def determine_size(filesize, using1024=False):
	global size

	multiple = 1024 if using1024 else 1000

    if filesize < 0:
        raise ValueError('File size should be larger than 0...')

    for suffix in size[multiple]:
        size /= multiple
        if size < multiple:
            return '{0:.1f}{1}'.format(size, suffix)

    raise ValueError('FileSize too big...')


if __name__ == '__main__':
    print(determine_size(1000000000, False))
    print(determine_size(1000000000))
